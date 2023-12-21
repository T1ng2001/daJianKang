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
@ApiModel("选课类")
@TableName("tbl_course_select")
public class courseSelect {
    @TableId(value = "course_select_id", type = IdType.AUTO)
    @ApiModelProperty("选课记录ID")
    private Long courseSelectId;
    @TableField(value = "uid")
    @ApiModelProperty("用户ID")
    private String uid;
    @TableField(value = "cid")
    @ApiModelProperty("课程ID")
    private Long cid;
}
