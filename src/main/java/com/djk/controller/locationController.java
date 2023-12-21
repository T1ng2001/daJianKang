package com.djk.controller;

import com.djk.domain.po.Location;
import com.djk.service.ILocationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "地区管理接口")
@CrossOrigin
@RestController
@RequestMapping("/locations")
public class locationController {
    @Autowired
    private ILocationService locationService;

    @PostMapping
    @ApiOperation("新增地区")
    public Result save(@RequestBody Location location) {
        boolean flag = locationService.save(location);
        Integer code = flag ? Code.LOCATION_INSERT_SUCCESS : Code.LOCATION_INSERT_FAIL;

        return Result.builder().code(code).build();
    }

    @DeleteMapping("/{locationId}")
    @ApiOperation("删除地区")
    public Result deleteById(@PathVariable Long locationId) {
        boolean flag = locationService.removeById(locationId);
        Integer code = flag ? Code.LOCATION_DELETE_SUCCESS : Code.LOCATION_DELETE_FAIL;

        return Result.builder().code(code).build();
    }

    @PutMapping
    @ApiOperation("修改地区")
    public Result update(@RequestBody Location location) {
        boolean flag = locationService.updateById(location);
        Integer code = flag ? Code.LOCATION_UPDATE_SUCCESS : Code.LOCATION_UPDATE_FAIL;

        return Result.builder().code(code).build();
    }

    @GetMapping
    @ApiOperation("查询所有地区")
    public Result getAll() {
        List<Location> locations = locationService.list();
        Integer code = locations != null ? Code.LOCATION_SEARCH_SUCCESS : Code.LOCATION_SEARCH_FAIL;

        return Result.builder().data(locations).code(code).build();
    }
}
