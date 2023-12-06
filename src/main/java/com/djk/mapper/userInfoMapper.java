package com.djk.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.djk.domain.UserInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface userInfoMapper extends BaseMapper<UserInfo> {
}
