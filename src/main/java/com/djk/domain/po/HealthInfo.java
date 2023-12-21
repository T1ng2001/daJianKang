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
import org.apache.ibatis.type.JdbcType;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ApiModel("健康信息类")
@TableName("tbl_health_info")
public class HealthInfo {
    @TableId(value = "health_info_id", type = IdType.AUTO)
    @ApiModelProperty("健康信息表ID")
    private Long healthInfoId;
    @TableField(value = "uid")
    @ApiModelProperty("用户ID")
    private String uid;
    @TableField(value = "cid")
    @ApiModelProperty("课程ID")
    private Long cid;
    @TableField(value = "testing_time", jdbcType = JdbcType.DATE)
    @ApiModelProperty("检测时间")
    private Date testingTime;
    @TableField(value = "weight")
    @ApiModelProperty("体重")
    private Double weight;
    @TableField(value = "height")
    @ApiModelProperty("身高")
    private Double height;
    @TableField(value = "BMI")
    @ApiModelProperty("BMI（体重指数）")
    private Double BMI;
    @TableField(value = "blood_pressure_systolic")
    @ApiModelProperty("收缩压")
    private Double bloodPressureSystolic;
    @TableField(value = "blood_pressure_diastolic")
    @ApiModelProperty("舒张压")
    private Double bloodPressureDiastolic;
    @TableField(value = "blood_fat_cholesterol")
    @ApiModelProperty("血脂-胆固醇")
    private Double bloodFatCholesterol;
    @TableField(value = "blood_fat_triglyceride")
    @ApiModelProperty("血脂-甘油三酯")
    private Double bloodFatTriglyceride;
    @TableField(value = "blood_fat_hdl")
    @ApiModelProperty("血脂-高密度脂蛋白")
    private Double bloodFatHdl;
    @TableField(value = "blood_fat_ldl")
    @ApiModelProperty("血脂-低密度脂蛋白")
    private Double bloodFatLdl;
    @TableField(value = "blood_glucose")
    @ApiModelProperty("血糖")
    private Double bloodGlucose;
    @TableField(value = "gastrointestinal_tract_condition")
    @ApiModelProperty("胃肠道")
    private String gastrointestinalTractCondition;
    @TableField(value = "sub_health_status")
    @ApiModelProperty("亚健康情况")
    private String subHealthStatus;
    @TableField(value = "smoke")
    @ApiModelProperty("是否抽烟")
    private String smoke;
    @TableField(value = "drink")
    @ApiModelProperty("是否喝酒")
    private String drink;
    @TableField(value = "sleepStatus")
    @ApiModelProperty("睡眠情况")
    private String sleep_status;
    @TableField(value = "dietaryHabit")
    @ApiModelProperty("饮食习惯")
    private String dietary_habit;
    @TableField(value = "intestinal_flora")
    @ApiModelProperty("肠道菌群")
    private String intestinalFlora;
}
