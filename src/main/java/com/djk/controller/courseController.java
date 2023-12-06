package com.djk.controller;

import com.djk.domain.Course;
import com.djk.service.ICourseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(tags = "课程管理接口")
@CrossOrigin
@RestController
@RequestMapping("/courses")
public class courseController {
    @Autowired
    private ICourseService courseService;

    @PostMapping
    @ApiOperation("新增选课")
    public Result save(@RequestBody Course course) {
        boolean flag = courseService.save(course);

        return Result.builder().code(flag ? Code.COURSE_INSERT_SUCCESS : Code.COURSE_INSERT_FAIL).build();
    }
}
