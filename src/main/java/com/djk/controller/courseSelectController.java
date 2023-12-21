package com.djk.controller;

import com.djk.domain.dto.courseDto;
import com.djk.domain.po.UserInfo;
import com.djk.domain.po.courseSelect;
import com.djk.service.ICourseSelectService;
import com.djk.service.IUserInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(tags = "选课接口")
@CrossOrigin
@RestController
@RequestMapping("/courseSelect")
public class courseSelectController {
    @Autowired
    private ICourseSelectService courseSelectService;
    @Autowired
    private IUserInfoService userInfoService;

    @PostMapping
    @ApiOperation("新增选课")
    public Result save(@RequestBody courseDto courseDto) {
        courseSelect courseSelect = new courseSelect();
        UserInfo userInfo = new UserInfo();
        BeanUtils.copyProperties(courseDto, courseSelect);
        BeanUtils.copyProperties(courseDto, userInfo);
        if (userInfoService.getByUid(userInfo.getUid()) != null) {
            userInfoService.updateById(userInfo);
        }
        else {
            userInfoService.save(userInfo);
        }
        boolean flag = courseSelectService.save(courseSelect);

        return Result.builder().code(flag ? Code.CS_INSERT_SUCCESS : Code.CS_INSERT_FAIL).build();
    }
}
