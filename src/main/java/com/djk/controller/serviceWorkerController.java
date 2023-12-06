package com.djk.controller;

import com.djk.domain.ServiceWorker;
import com.djk.service.IServiceWorkerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "健康服务人员管理接口")
@CrossOrigin
@RestController
@RequestMapping("workers")
public class serviceWorkerController {
    @Autowired
    private IServiceWorkerService serviceWorkerService;

    @GetMapping
    @ApiOperation("查询所有健康服务人员")
    public Result getAll() {
        List<ServiceWorker> serviceWorkers = serviceWorkerService.list();
        Integer code = serviceWorkers != null ? Code.WORKER_SEARCH_SUCCESS : Code.WORKER_SEARCH_FAIL;

        return Result.builder().data(serviceWorkers).code(code).build();
    }
}
