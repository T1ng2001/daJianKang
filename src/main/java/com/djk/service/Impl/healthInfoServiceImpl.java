package com.djk.service.Impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.djk.domain.po.HealthInfo;
import com.djk.mapper.healthInfoMapper;
import com.djk.service.IHealthInfoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class healthInfoServiceImpl extends ServiceImpl<healthInfoMapper, HealthInfo> implements IHealthInfoService {
    @Override
    public Long getCidByUid(String uid) {
        Long cid = baseMapper.getCidByUid(uid);

        return cid != 0 ? cid : -1;
    }

    @Override
    public List<HealthInfo> getHealthInfo(String uid, Long cid) {
        return baseMapper.getHealthInfo(uid, cid);
    }

}
