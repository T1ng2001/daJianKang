package com.djk.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.djk.domain.po.Course;
import java.util.List;

public interface ICourseService extends IService<Course> {
    public List<Course> getAllByLocationName(String locationName);
}
