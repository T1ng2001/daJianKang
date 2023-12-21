package com.djk.controller;

import com.djk.domain.po.ServiceWorker;
import com.djk.service.IServiceWorkerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "健康服务人员管理接口")
@CrossOrigin
@RestController
@RequestMapping("workers")
public class serviceWorkerController {
    @Autowired
    private IServiceWorkerService serviceWorkerService;

    @PostMapping
    @ApiOperation("新增健康服务人员")
    public Result save(@RequestBody ServiceWorker serviceWorker) {
        boolean flag = serviceWorkerService.save(serviceWorker);
        Integer code = flag ? Code.WORKER_INSERT_SUCCESS : Code.WORKER_INSERT_FAIL;

        return Result.builder().code(code).build();
    }

    @DeleteMapping("/{serviceWorkerId}")
    @ApiOperation("删除健康服务人员")
    public Result deleteByServiceWorkerId(@PathVariable Long serviceWorkerId) {
        boolean flag = serviceWorkerService.removeById(serviceWorkerId);
        Integer code = flag ? Code.WORKER_DELETE_SUCCESS : Code.WORKER_DELETE_FAIL;

        return Result.builder().code(code).build();
    }

    @GetMapping
    @ApiOperation("查询所有健康服务人员")
    public Result getAll() {
        List<ServiceWorker> serviceWorkers = serviceWorkerService.list();
        Integer code = serviceWorkers != null ? Code.WORKER_SEARCH_SUCCESS : Code.WORKER_SEARCH_FAIL;

        return Result.builder().data(serviceWorkers).code(code).build();
    }
}
