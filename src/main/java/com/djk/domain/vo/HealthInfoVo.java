package com.djk.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ApiModel("健康信息VO实体")
public class HealthInfoVo {
    @ApiModelProperty("健康信息表ID")
    private Long healthInfoId;
    @ApiModelProperty("用户ID")
    private String uid;
    @ApiModelProperty("检测时间")
    private Date testingTime;
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
}
