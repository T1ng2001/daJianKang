package com.djk.controller;

import com.djk.domain.po.CourseType;
import com.djk.service.ICourseTypeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "课程类型管理接口")
@CrossOrigin
@RestController
@RequestMapping("/courseTypes")
public class courseTypeController {
    @Autowired
    private ICourseTypeService courseTypeService;

    @PostMapping
    @ApiOperation("新增课程类型")
    public Result save(@RequestBody CourseType courseType) {
        boolean flag = courseTypeService.save(courseType);
        Integer code = flag ? Code.COURSE_TYPE_DELETE_SUCCESS : Code.COURSE_TYPE_INSERT_FAIL;

        return Result.builder().code(code).build();
    }

    @DeleteMapping("/{courseTypeId}")
    @ApiOperation("删除课程类型")
    public Result deleteById(@PathVariable Long courseTypeId) {
        boolean flag = courseTypeService.removeById(courseTypeId);
        Integer code = flag ? Code.COURSE_TYPE_DELETE_SUCCESS : Code.COURSE_TYPE_DELETE_FAIL;

        return Result.builder().code(code).build();
    }

    @PutMapping
    @ApiOperation("修改课程类型")
    public Result update(@RequestBody CourseType courseType) {
        boolean flag = courseTypeService.updateById(courseType);
        Integer code = flag ? Code.COURSE_TYPE_UPDATE_SUCCESS : Code.COURSE_TYPE_UPDATE_FAIL;

        return Result.builder().code(code).build();
    }

    @GetMapping
    @ApiOperation("查询所有课程类型")
    public Result getAll() {
        List<CourseType> courseTypes = courseTypeService.list();
        Integer code = courseTypes != null ? Code.COURSE_TYPE_SELECT_SUCCESS : Code.COURSE_TYPE_SELECT_FAIL;

        return Result.builder().data(courseTypes).code(code).build();
    }
}
