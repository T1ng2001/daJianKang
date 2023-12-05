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
@TableName("tbl_user_info")
public class UserInfo {
    @TableId(value = "user_info_id", type = IdType.AUTO)
    private Long userInfoId;
    @TableField(value = "uid")
    private String uid;
    @TableField(value = "user_name")
    private String userName;
    @TableField(value = "gender")
    private String gender;
    @TableField(value = "age")
    private int age;
    @TableField(value = "height")
    private double height;
    @TableField(value = "weight")
    private double weight;
}
