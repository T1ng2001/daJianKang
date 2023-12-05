package com.djk.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.djk.domain.CourseType;
import com.djk.mapper.courseTypeMapper;
import com.djk.service.ICourseTypeService;
import org.springframework.stereotype.Service;

@Service
public class courseTypeServiceImpl extends ServiceImpl<courseTypeMapper, CourseType> implements ICourseTypeService {
}
