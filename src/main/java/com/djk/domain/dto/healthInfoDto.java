package com.djk.domain.dto;

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
@ApiModel("健康信息表单实体")
public class healthInfoDto {
    @ApiModelProperty("用户ID")
    private String uid;
    @ApiModelProperty("课程ID")
    private Long cid;
    @ApiModelProperty("用户姓名")
    private String username;
    @ApiModelProperty("用户性别")
    private int gender;
    @ApiModelProperty("用户年龄")
    private int age;
    @ApiModelProperty("体重")
    private Double weight;
    @ApiModelProperty("身高")
    private Double height;
    @ApiModelProperty("BMI（体重指数）")
    private Double BMI;
    @ApiModelProperty("收缩压")
    private Double bloodPressureSystolic;
    @ApiModelProperty("舒张压")
    private Double bloodPressureDiastolic;
    @ApiModelProperty("血脂-胆固醇")
    private Double bloodFatCholesterol;
    @ApiModelProperty("血脂-甘油三酯")
    private Double bloodFatTriglyceride;
    @ApiModelProperty("血脂-高密度脂蛋白")
    private Double bloodFatHdl;
    @ApiModelProperty("血脂-低密度脂蛋白")
    private Double bloodFatLdl;
    @ApiModelProperty("血糖")
    private Double bloodGlucose;
    @ApiModelProperty("胃肠道")
    private String gastrointestinalTractCondition;
    @ApiModelProperty("亚健康情况")
    private String subHealthStatus;
    @ApiModelProperty("是否抽烟")
    private int smoke;
    @ApiModelProperty("是否喝酒")
    private int drink;
    @ApiModelProperty("睡眠情况")
    private String sleepStatus;
    @ApiModelProperty("饮食习惯")
    private String dietaryHabit;
    @ApiModelProperty("肠道菌群")
    private String intestinalFlora;
}
