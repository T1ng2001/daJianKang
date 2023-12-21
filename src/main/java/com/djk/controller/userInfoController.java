package com.djk.controller;

import com.djk.domain.po.UserInfo;
import com.djk.service.IUserInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(tags = "用户信息管理接口")
@CrossOrigin
@RestController
@RequestMapping("/userinfos")
public class userInfoController {
    @Autowired
    private IUserInfoService userInfoService;

    @GetMapping("/{uid}")
    @ApiOperation("根据uid查询用户信息")
    public Result getByUid(@PathVariable String uid) {
        UserInfo userInfo = userInfoService.getByUid(uid);
        Integer code = userInfo != null ? Code.USER_INFO_SEARCH_SUCCESS : Code.USER_INFO_SEARCH_FAIL;

        return Result.builder().data(userInfo).code(code).build();
    }
}
