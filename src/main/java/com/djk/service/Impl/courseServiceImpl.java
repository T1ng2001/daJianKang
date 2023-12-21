package com.djk.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.djk.domain.po.Course;
import com.djk.mapper.courseMapper;
import com.djk.service.ICourseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class courseServiceImpl extends ServiceImpl<courseMapper, Course> implements ICourseService {
    @Override
    public List<Course> getAllByLocationName(String locationName) {
        List<Course> courses = baseMapper.getAllByLocationName(locationName);

        return courses;
    }
}
