package com.djk.controller;

import com.djk.service.IUserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(tags = "用户管理接口")
@CrossOrigin
@RestController
@RequestMapping("/users")
public class userController {
    @Autowired
    private IUserService userService;
}
