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
@TableName("tbl_service_worker")
public class ServiceWorker {
    @TableId(value = "service_worker_id", type = IdType.AUTO)
    private Long serviceWorkerId;
    @TableField(value = "service_worker_name")
    private String serviceWorkerName;
}
