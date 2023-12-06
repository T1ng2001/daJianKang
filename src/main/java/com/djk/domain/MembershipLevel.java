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
@ApiModel("会员级别类")
@TableName("tbl_membership_level")
public class MembershipLevel {
    @TableId(value = "level_id", type = IdType.AUTO)
    @ApiModelProperty("会员级别表ID")
    private Long levelId;
    @TableField(value = "level_name")
    @ApiModelProperty("会员级别")
    private String levelName;
}
