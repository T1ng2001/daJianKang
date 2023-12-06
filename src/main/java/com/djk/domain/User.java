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
@ApiModel("用户类")
@TableName("tbl_user")
public class User {
    @TableId(value = "uid", type = IdType.ASSIGN_ID)
    @ApiModelProperty("用户ID")
    private String uid;
    @TableField(value = "union_id")
    @ApiModelProperty("UnionID")
    private String unionId;
    @TableField(value = "nick_name")
    @ApiModelProperty("昵称")
    private String nickName;
    @TableField(value = "icon")
    @ApiModelProperty("用户头像")
    private String icon;
}
