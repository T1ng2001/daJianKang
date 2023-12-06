package com.djk.controller;

import com.djk.domain.Teacher;
import com.djk.service.ITeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "带班老师管理接口")
@CrossOrigin
@RestController
@RequestMapping("/teachers")
public class teacherController {
    @Autowired
    private ITeacherService teacherService;

    @GetMapping
    @ApiOperation("查询所有带班老师")
    public Result getAll() {
        List<Teacher> teachers = teacherService.list();
        Integer code = teachers != null ? Code.TEACHER_SEARCH_SUCCESS : Code.TEACHER_SEARCH_FAIL;

        return Result.builder().data(teachers).code(code).build();
    }
}
