package com.djk.domain.vo;

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
@ApiModel("课程VO实体")
public class courseVo {
    @ApiModelProperty("课程ID")
    private Long cid;
    @ApiModelProperty("课程类型")
    private String courseType;
    @ApiModelProperty("带班老师姓名")
    private String teacherName;
    @ApiModelProperty("会员等级")
    private String levelName;
    @ApiModelProperty("健康服务人员")
    private String serviceWorkerName;
}
