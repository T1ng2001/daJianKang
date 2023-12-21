package com.djk.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.djk.domain.po.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface userInfoMapper extends BaseMapper<UserInfo> {
    @Select("select * from tbl_user_info where uid = #{uid}")
    public UserInfo getByUid(String uid);
}
