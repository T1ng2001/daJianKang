package com.djk.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@TableName("tbl_health_info")
public class HealthInfo {
    @TableId(value = "health_info_id", type = IdType.AUTO)
    private Long healthInfoId;
    @TableField(value = "uid")
    private String uid;
    @TableField(value = "testing_time")
    private Date testingTime;
    @TableField(value = "weight")
    private Double weight;
    @TableField(value = "height")
    private Double height;
    @TableField(value = "BMI")
    private Double BMI;
    //收缩压
    @TableField(value = "blood_pressure_systolic")
    private Double bloodPressureSystolic;
    //舒张压
    @TableField(value = "blood_pressure_diastolic")
    private Double bloodPressureDiastolic;
    //血脂-胆固醇
    @TableField(value = "blood_fat_cholesterol")
    private Double bloodFatCholesterol;
    //血脂-甘油三酯
    @TableField(value = "blood_fat_triglyceride")
    private Double bloodFatTriglyceride;
    //血脂-高密度脂蛋白
    @TableField(value = "blood_fat_hdl")
    private Double bloodFatHdl;
    //血脂-低密度脂蛋白
    @TableField(value = "blood_fat_ldl")
    private Double blood_fat_ldl;
    //血糖
    @TableField(value = "blood_glucose")
    private Double bloodGlucose;
    //胃肠道
    @TableField(value = "gastrointestinal_tract_condition")
    private String gastrointestinalTractCondition;
    //亚健康情况
    @TableField(value = "sub_health_status")
    private String subHealthStatus;
    //是否抽烟
    @TableField(value = "smoke")
    private String smoke;
    //是否喝酒
    @TableField(value = "drink")
    private String drink;
    //睡眠情况
    @TableField(value = "sleepStatus")
    private String sleep_status;
    //饮食习惯
    @TableField(value = "dietaryHabit")
    private String dietary_habit;
    //肠道菌群
    @TableField(value = "intestinal_flora")
    private String intestinalFlora;
}
