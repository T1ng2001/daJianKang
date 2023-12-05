package com.djk.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.djk.domain.User;
import com.djk.mapper.userMapper;
import com.djk.service.IUserService;
import org.springframework.stereotype.Service;

@Service
public class userServiceImpl extends ServiceImpl<userMapper, User> implements IUserService {
}
