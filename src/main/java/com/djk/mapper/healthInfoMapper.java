package com.djk.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.djk.domain.po.HealthInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface healthInfoMapper extends BaseMapper<HealthInfo> {
    @Select("select max(cid) from tbl_course_select where uid = #{uid}")
    public Long getCidByUid(String uid);

    @Select("select * from tbl_health_info where uid = #{uid} and cid = #{cid}")
    public List<HealthInfo> getHealthInfo(String uid,Long cid);
}
