package com.djk.domain.po;

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
@ApiModel("带班老师类")
@TableName("tbl_teacher")
public class Teacher {
    @TableId(value = "teacher_id", type = IdType.AUTO)
    @ApiModelProperty("带班老师表ID")
    private Long teacherId;
    @TableField(value = "teacher_name")
    @ApiModelProperty("带班老师姓名")
    private String teacherName;
}
