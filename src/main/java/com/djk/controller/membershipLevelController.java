package com.djk.controller;

import com.djk.domain.po.MembershipLevel;
import com.djk.service.IMembershipLevelService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "会员级别管理接口")
@CrossOrigin
@RestController
@RequestMapping("levels")
public class membershipLevelController {
    @Autowired
    private IMembershipLevelService membershipLevelService;

    @PostMapping
    @ApiOperation("新增会员级别")
    public Result save(@RequestBody MembershipLevel membershipLevel) {
        boolean flag = membershipLevelService.save(membershipLevel);
        Integer code = flag ? Code.LEVEL_INSERT_SUCCESS : Code.LEVEL_INSERT_FAIL;

        return Result.builder().code(code).build();
    }

    @DeleteMapping("/{levelId}")
    @ApiOperation("删除会员级别")
    public Result deleteByLevelId(@PathVariable Long levelId) {
        boolean flag = membershipLevelService.removeById(levelId);
        Integer code = flag ? Code.LEVEL_DELETE_SUCCESS : Code.LEVEL_DELETE_FAIL;

        return Result.builder().code(code).build();
    }

    @GetMapping
    @ApiOperation("查询所有会员级别")
    public Result getAll() {
        List<MembershipLevel> membershipLevels = membershipLevelService.list();
        Integer code = membershipLevels != null ? Code.LEVEL_SEARCH_SUCCESS : Code.LEVEL_SEARCH_FAIL;

        return Result.builder().data(membershipLevels).code(code).build();
    }
}
