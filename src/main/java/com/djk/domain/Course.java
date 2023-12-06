package com.djk.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ApiModel("选课类")
@TableName("tbl_course")
public class Course {
    @TableId(value = "cid", type = IdType.AUTO)
    @ApiModelProperty("选课记录表ID")
    private Long cid;
    @TableField(value = "uid")
    @ApiModelProperty("用户ID")
    private String uid;
    @TableField(value = "location_name")
    @ApiModelProperty("选课地区")
    private String locationName;
    @TableField(value = "course_type")
    @ApiModelProperty("课程类型")
    private String courseType;
    @TableField(value = "level_name")
    @ApiModelProperty("会员等级")
    private String levelName;
    @TableField(value = "service_worker_name")
    @ApiModelProperty("健康服务人员")
    private String serviceWorkerName;
}
