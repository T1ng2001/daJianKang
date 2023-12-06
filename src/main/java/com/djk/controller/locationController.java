package com.djk.controller;

import com.djk.domain.Location;
import com.djk.service.ILocationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "地区管理接口")
@CrossOrigin
@RestController
@RequestMapping("/locations")
public class locationController {
    @Autowired
    private ILocationService locationService;

    @GetMapping
    @ApiOperation("查询所有地区")
    public Result getAll() {
        List<Location> locations = locationService.list();
        Integer code = locations != null ? Code.LOCATION_SEARCH_SUCCESS : Code.LOCATION_SEARCH_FAIL;

        return Result.builder().data(locations).code(code).build();
    }
}
