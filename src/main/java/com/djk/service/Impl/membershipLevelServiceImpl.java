package com.djk.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.djk.domain.po.MembershipLevel;
import com.djk.mapper.membershipLevelMapper;
import com.djk.service.IMembershipLevelService;
import org.springframework.stereotype.Service;

@Service
public class membershipLevelServiceImpl extends ServiceImpl<membershipLevelMapper, MembershipLevel> implements IMembershipLevelService {
}
