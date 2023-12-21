package com.djk.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.djk.domain.po.HealthInfo;

import java.util.List;

public interface IHealthInfoService extends IService<HealthInfo> {
    public Long getCidByUid(String uid);

    public List<HealthInfo> getHealthInfo(String uid, Long cid);
}
