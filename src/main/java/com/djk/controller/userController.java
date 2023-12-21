package com.djk.controller;

import com.djk.domain.po.User;
import com.djk.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "用户管理接口")
@CrossOrigin
@RestController
@RequestMapping("/users")
public class userController {
    @Autowired
    private IUserService userService;

    @PostMapping
    @ApiOperation("新增用户")
    public Result save(@RequestBody User user) {
        boolean flag = userService.save(user);
        Integer code = flag ? Code.USER_INSERT_SUCCESS : Code.USER_INSERT_FAIL;

        return Result.builder().code(code).build();
    }

    @DeleteMapping("/{uid}")
    @ApiOperation("删除用户")
    public Result deleteByUid(@PathVariable String uid) {
        boolean flag = userService.removeById(uid);
        Integer code = flag ? Code.USER_DELETE_SUCCESS : Code.USER_DELETE_FAIL;

        return Result.builder().code(code).build();
    }

    @GetMapping
    @ApiOperation("查询所有用户")
    public Result getAll() {
        List<User> users = userService.list();
        Integer code = users != null ? Code.USER_SEARCH_SUCCESS : Code.USER_SEARCH_FAIL;

        return Result.builder().data(users).code(code).build();
    }
}
