package com.djk.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.djk.domain.po.ServiceWorker;
import com.djk.mapper.serviceWorkerMapper;
import com.djk.service.IServiceWorkerService;
import org.springframework.stereotype.Service;

@Service
public class serviceWorkerServiceImpl extends ServiceImpl<serviceWorkerMapper, ServiceWorker> implements IServiceWorkerService {
}
