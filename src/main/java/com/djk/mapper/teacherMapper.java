package com.djk.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.djk.domain.Teacher;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface teacherMapper extends BaseMapper<Teacher> {
}
