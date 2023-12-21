package com.djk.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.djk.domain.po.Course;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

import static com.baomidou.mybatisplus.core.toolkit.Constants.MYBATIS_PLUS;
import static com.baomidou.mybatisplus.core.toolkit.StringPool.UNDERSCORE;

@Mapper
public interface courseMapper extends BaseMapper<Course> {
    @Select("select * from tbl_course where location_name = #{locationName}")
    @ResultMap(MYBATIS_PLUS + UNDERSCORE + "Course")
    public List<Course> getAllByLocationName(String locationName);
}
