package com.djk.domain.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ApiModel("选课表单实体")
public class courseDto {
    @ApiModelProperty("用户ID")
    private String uid;
    @ApiModelProperty("用户姓名")
    private String username;
    @ApiModelProperty("用户性别")
    private int gender;
    @ApiModelProperty("用户年龄")
    private int age;
    @ApiModelProperty("用户体重")
    private double weight;
    @ApiModelProperty("用户身高")
    private double height;
    @ApiModelProperty("课程ID")
    private Long cid;
    @ApiModelProperty("选课地区")
    private String locationName;
    @ApiModelProperty("课程类型")
    private String courseType;
    @ApiModelProperty("带班老师姓名")
    private List<String> teachersName;
    @ApiModelProperty("会员等级")
    private String levelName;
    @ApiModelProperty("健康服务人员")
    private String serviceWorkerName;
}
