package com.djk.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.djk.domain.HealthInfo;
import com.djk.mapper.healthInfoMapper;
import com.djk.service.IHealthInfoService;
import org.springframework.stereotype.Service;

@Service
public class healthInfoServiceImpl extends ServiceImpl<healthInfoMapper, HealthInfo> implements IHealthInfoService {
}
