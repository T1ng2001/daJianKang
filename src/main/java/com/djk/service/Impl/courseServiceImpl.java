package com.djk.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.djk.domain.Course;
import com.djk.mapper.courseMapper;
import com.djk.service.ICourseService;
import org.springframework.stereotype.Service;

@Service
public class courseServiceImpl extends ServiceImpl<courseMapper, Course> implements ICourseService {
}
