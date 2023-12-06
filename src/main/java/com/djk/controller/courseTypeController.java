package com.djk.controller;

import com.djk.domain.CourseType;
import com.djk.service.ICourseTypeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "课程类型管理接口")
@CrossOrigin
@RestController
@RequestMapping("/courseTypes")
public class courseTypeController {
    @Autowired
    private ICourseTypeService courseTypeService;

    @GetMapping
    @ApiOperation("查询所有课程类型")
    public Result getAll() {
        List<CourseType> courseTypes = courseTypeService.list();
        Integer code = courseTypes != null ? Code.COURSE_TYPE_SELECT_SUCCESS : Code.COURSE_TYPE_SELECT_FAIL;

        return Result.builder().data(courseTypes).code(code).build();
    }
}
