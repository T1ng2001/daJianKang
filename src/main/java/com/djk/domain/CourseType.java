package com.djk.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@TableName("tbl_course_type")
public class CourseType {
    @TableId(value = "course_type_id", type = IdType.AUTO)
    private Long courseTypeId;
    @TableField(value = "course_type")
    private String courseType;
}
