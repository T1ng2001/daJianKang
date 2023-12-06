package com.djk.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.djk.domain.HealthInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface healthInfoMapper extends BaseMapper<HealthInfo> {
}
