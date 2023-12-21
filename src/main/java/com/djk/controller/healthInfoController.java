package com.djk.controller;

import com.djk.domain.dto.healthInfoDto;
import com.djk.domain.po.HealthInfo;
import com.djk.service.IHealthInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.ZoneId;
import java.util.*;

@Api(tags = "健康信息管理接口")
@CrossOrigin
@RestController
@RequestMapping("/healthInfos")
public class healthInfoController {
    @Autowired
    private IHealthInfoService healthInfoService;

    @PostMapping
    @ApiOperation("新增每日健康数据")
    public Result save(@RequestBody healthInfoDto healthInfoDto) {
        HealthInfo healthInfo = new HealthInfo();
        BeanUtils.copyProperties(healthInfoDto, healthInfo);
        double weight = healthInfo.getWeight();
        double height = healthInfo.getHeight() / 100.0;
        double BMI = weight / Math.pow(height, 2);
        Date testingTime = new java.sql.Date(new Date().getTime());
        healthInfo.setTestingTime(testingTime);
        healthInfo.setBMI(BMI);
        System.out.println(healthInfo);
        boolean flag = healthInfoService.save(healthInfo);
        Integer code = flag ? Code.HEALTH_INFO_INSERT_SUCCESS : Code.HEALTH_INFO_INSERT_FAIL;

        return Result.builder().code(code).build();
    }

    @GetMapping("/{uid}")
    @ApiOperation("获取用户健康数据")
    public Result getHealthInfo(@PathVariable String uid) {
        Long cid = healthInfoService.getCidByUid(uid);
        List<HealthInfo> healthInfos = healthInfoService.getHealthInfo(uid, cid);
        Map<String, Object> map = new HashMap<>();
        List<Date> testingTimeList = new ArrayList<>();
        List<Double> weightList = new ArrayList<>();
        List<Double> BMIList = new ArrayList<>();
        List<Double> bloodPressureSystolicList = new ArrayList<>();
        List<Double> bloodPressureDiastolicList = new ArrayList<>();
        List<Double> bloodFatCholesterolList = new ArrayList<>();
        List<Double> bloodFatTriglycerideList = new ArrayList<>();
        List<Double> bloodFatHdlList = new ArrayList<>();
        List<Double> bloodFatLdlList = new ArrayList<>();
        List<Double> bloodGlucoseList = new ArrayList<>();

        for (HealthInfo h : healthInfos) {
            testingTimeList.add(h.getTestingTime());
            weightList.add(h.getWeight());
            BMIList.add(h.getBMI());
            bloodPressureSystolicList.add(h.getBloodPressureSystolic());
            bloodPressureDiastolicList.add(h.getBloodPressureDiastolic());
            bloodFatCholesterolList.add(h.getBloodFatCholesterol());
            bloodFatTriglycerideList.add(h.getBloodFatTriglyceride());
            bloodFatHdlList.add(h.getBloodFatHdl());
            bloodFatLdlList.add(h.getBloodFatLdl());
            bloodGlucoseList.add(h.getBloodGlucose());
        }

        map.put("testingTime", testingTimeList);
        map.put("weight", weightList);
        map.put("BMIList", BMIList);
        map.put("bloodPressureSystolic", bloodPressureSystolicList);
        map.put("bloodPressureDiastolic", bloodPressureDiastolicList);
        map.put("bloodFatCholesterol", bloodFatCholesterolList);
        map.put("bloodFatTriglyceride", bloodFatTriglycerideList);
        map.put("bloodFatHdl", bloodFatHdlList);
        map.put("bloodFatLdl", bloodFatLdlList);
        map.put("bloodGlucose", bloodGlucoseList);

        Integer code = map != null ? Code.HEALTH_INFO_SEARCH_SUCCESS : Code.HEALTH_INFO_SEARCH_FAIL;

        return Result.builder().data(map).code(code).build();
    }
}
