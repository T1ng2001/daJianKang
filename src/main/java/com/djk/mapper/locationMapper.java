package com.djk.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.djk.domain.Location;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface locationMapper extends BaseMapper<Location> {
}
