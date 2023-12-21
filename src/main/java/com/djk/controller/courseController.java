package com.djk.controller;

import com.djk.domain.po.Course;
import com.djk.service.ICourseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "课程管理接口")
@CrossOrigin
@RestController
@RequestMapping("/courses")
public class courseController {
    @Autowired
    private ICourseService courseService;

    @PostMapping
    @ApiOperation("新增课程")
    public Result save(@RequestBody Course course) {
        boolean flag = courseService.save(course);
        Integer code = flag ? Code.COURSE_INSERT_SUCCESS : Code.COURSE_INSERT_FAIL;

        return Result.builder().code(code).build();
    }

    @DeleteMapping("/{cid}")
    @ApiOperation("删除课程")
    public Result deleteByCid(@PathVariable Long cid) {
        boolean flag = courseService.removeById(cid);
        Integer code = flag ? Code.COURSE_DELETE_SUCCESS : Code.COURSE_DELETE_FAIL;

        return Result.builder().code(code).build();
    }

    @GetMapping("/location/{locationName}")
    @ApiOperation("查询当前地区课程")
    public Result searchCourseByLocation(@PathVariable String locationName) {
        List<Course> courses = courseService.getAllByLocationName(locationName);
        Integer code = courses != null ? Code.COURSE_SELECT_SUCCESS : Code.COURSE_SELECT_FAIL;

        return Result.builder().data(courses).code(code).build();
    }
}
