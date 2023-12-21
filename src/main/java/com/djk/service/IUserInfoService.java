package com.djk.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.djk.domain.po.UserInfo;

public interface IUserInfoService extends IService<UserInfo> {
    public UserInfo getByUid(String uid);
}
