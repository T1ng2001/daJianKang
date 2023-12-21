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
@ApiModel("用户信息类")
@TableName("tbl_user_info")
public class UserInfo {
    @TableId(value = "user_info_id", type = IdType.AUTO)
    @ApiModelProperty("用户信息表ID")
    private Long userInfoId;
    @TableField(value = "uid")
    @ApiModelProperty("用户ID")
    private String uid;
    @TableField(value = "user_name")
    @ApiModelProperty("用户姓名")
    private String username;
    @TableField(value = "gender")
    @ApiModelProperty("用户性别")
    private int gender;
    @TableField(value = "age")
    @ApiModelProperty("用户年龄")
    private int age;
    @TableField(value = "height")
    @ApiModelProperty("用户身高")
    private double height;
    @TableField(value = "weight")
    @ApiModelProperty("用户体重")
    private double weight;
}
