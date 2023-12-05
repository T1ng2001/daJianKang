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
@TableName("tbl_user")
public class User {
    @TableId(value = "uid", type = IdType.ASSIGN_ID)
    private String uid;
    @TableField(value = "union_id")
    private String unionId;
    @TableField(value = "nick_name")
    private String nickName;
    @TableField(value = "icon")
    private String icon;
}
