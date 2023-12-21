package com.djk.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.djk.domain.po.Teacher;
import com.djk.mapper.teacherMapper;
import com.djk.service.ITeacherService;
import org.springframework.stereotype.Service;

@Service
public class teacherServiceImpl extends ServiceImpl<teacherMapper, Teacher> implements ITeacherService {
}
