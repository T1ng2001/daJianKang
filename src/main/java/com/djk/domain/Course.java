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
@TableName("tbl_course")
public class Course {
    @TableId(value = "cid", type = IdType.AUTO)
    private Long cid;
    @TableField(value = "uid")
    private String uid;
    @TableField(value = "location_name")
    private String locationName;
    @TableField(value = "course_type")
    private String courseType;
    @TableField(value = "level_name")
    private String levelName;
    @TableField(value = "service_worker_name")
    private String serviceWorkerName;
}
