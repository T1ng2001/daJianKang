package com.djk.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.djk.domain.po.courseSelect;
import com.djk.mapper.courseSelectMapper;
import com.djk.service.ICourseSelectService;
import org.springframework.stereotype.Service;

@Service
public class courseSelectServiceImpl extends ServiceImpl<courseSelectMapper, courseSelect> implements ICourseSelectService {
}
