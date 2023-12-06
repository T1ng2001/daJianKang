package com.djk.controller;

import com.djk.service.IUserInfoService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "用户信息管理接口")
@CrossOrigin
@RestController
@RequestMapping("/userinfos")
public class userInfoController {
    @Autowired
    private IUserInfoService userInfoService;
}
