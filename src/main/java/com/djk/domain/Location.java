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
@ApiModel("地区类")
@TableName("tbl_location")
public class Location {
    @TableId(value = "location_id", type = IdType.AUTO)
    @ApiModelProperty("地区表ID")
    private Long locationId;
    @TableField("location_name")
    @ApiModelProperty("地区名字")
    private String locationName;
}
