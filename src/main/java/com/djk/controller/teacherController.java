package com.djk.controller;

import com.djk.domain.po.Teacher;
import com.djk.service.ITeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "带班老师管理接口")
@CrossOrigin
@RestController
@RequestMapping("/teachers")
public class teacherController {
    @Autowired
    private ITeacherService teacherService;

    @PostMapping
    @ApiOperation("新增带班老师")
    public Result save(@RequestBody Teacher teacher) {
        boolean flag = teacherService.save(teacher);
        Integer code = flag ? Code.TEACHER_INSERT_SUCCESS : Code.COURSE_INSERT_FAIL;

        return Result.builder().code(code).build();
    }

    @DeleteMapping("/{teacherId}")
    @ApiOperation("删除带班老师")
    public Result deleteById(@PathVariable Long teacherId) {
        boolean flag = teacherService.removeById(teacherId);
        Integer code = flag ? Code.TEACHER_DELETE_SUCCESS : Code.TEACHER_DELETE_FAIL;

        return Result.builder().code(code).build();
    }

    @GetMapping
    @ApiOperation("查询所有带班老师")
    public Result getAll() {
        List<Teacher> teachers = teacherService.list();
        Integer code = teachers != null ? Code.TEACHER_SEARCH_SUCCESS : Code.TEACHER_SEARCH_FAIL;

        return Result.builder().data(teachers).code(code).build();
    }
}
