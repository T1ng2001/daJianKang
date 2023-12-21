package com.djk.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.djk.domain.po.Location;
import com.djk.mapper.locationMapper;
import com.djk.service.ILocationService;
import org.springframework.stereotype.Service;

@Service
public class locationServiceImpl extends ServiceImpl<locationMapper, Location> implements ILocationService {
}
