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
@ApiModel("课程类型类")
@TableName("tbl_course_type")
public class CourseType {
    @TableId(value = "course_type_id", type = IdType.AUTO)
    @ApiModelProperty("课程类型表ID")
    private Long courseTypeId;
    @TableField(value = "course_type")
    @ApiModelProperty("课程类型")
    private String courseType;
}
