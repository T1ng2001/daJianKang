package com.djk.controller;

import com.djk.domain.MembershipLevel;
import com.djk.service.IMembershipLevelService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "会员级别管理接口")
@CrossOrigin
@RestController
@RequestMapping("levels")
public class membershipLevelController {
    @Autowired
    private IMembershipLevelService membershipLevelService;

    @GetMapping
    @ApiOperation("查询所有会员级别")
    public Result getAll() {
        List<MembershipLevel> membershipLevels = membershipLevelService.list();
        Integer code = membershipLevels != null ? Code.LEVEL_SEARCH_SUCCESS : Code.LEVEL_SEARCH_FAIL;

        return Result.builder().data(membershipLevels).code(code).build();
    }
}
