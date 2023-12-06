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
@ApiModel("健康服务人员类")
@TableName("tbl_service_worker")
public class ServiceWorker {
    @TableId(value = "service_worker_id", type = IdType.AUTO)
    @ApiModelProperty("健康服务人员表ID")
    private Long serviceWorkerId;
    @TableField(value = "service_worker_name")
    @ApiModelProperty("健康服务人员姓名")
    private String serviceWorkerName;
}
