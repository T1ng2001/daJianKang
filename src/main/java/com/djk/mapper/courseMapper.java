package com.djk.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.djk.domain.Course;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface courseMapper extends BaseMapper<Course> {
}
