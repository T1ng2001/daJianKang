package com.djk.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.djk.domain.UserInfo;
import com.djk.mapper.userInfoMapper;
import com.djk.service.IUserInfoService;
import org.springframework.stereotype.Service;

@Service
public class userInfoServiceImpl extends ServiceImpl<userInfoMapper, UserInfo> implements IUserInfoService {
}
