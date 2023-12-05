package com.djk.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HealthInfoVo {
    private Long healthInfoId;
    private String uid;
    private Date testingTime;
    private Double weight;
    private Double height;
    private Double BMI;
    //收缩压
    private Double bloodPressureSystolic;
    //舒张压
    private Double bloodPressureDiastolic;
    //血脂-胆固醇
    private Double bloodFatCholesterol;
    //血脂-甘油三酯
    private Double bloodFatTriglyceride;
    //血脂-高密度脂蛋白
    private Double bloodFatHdl;
    //血脂-低密度脂蛋白
    private Double blood_fat_ldl;
    //血糖
    private Double bloodGlucose;
}
