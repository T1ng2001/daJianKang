package com.djk.domain.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.djk.handler.ListToVarcharTypeHandler;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ApiModel("课程类")
@TableName(value = "tbl_course", autoResultMap = true)
public class Course {
    @TableId(value = "cid", type = IdType.AUTO)
    @ApiModelProperty("选课记录表ID")
    private Long cid;
    @TableField(value = "location_name")
    @ApiModelProperty("选课地区")
    private String locationName;
    @TableField(value = "course_type")
    @ApiModelProperty("课程类型")
    private String courseType;
    @TableField(value = "teachers_name", typeHandler = ListToVarcharTypeHandler.class)
    @ApiModelProperty("带班老师姓名")
    private List<String> teacherName;
    @TableField(value = "level_name")
    @ApiModelProperty("会员等级")
    private String levelName;
    @TableField(value = "service_worker_name")
    @ApiModelProperty("健康服务人员")
    private String serviceWorkerName;
}
