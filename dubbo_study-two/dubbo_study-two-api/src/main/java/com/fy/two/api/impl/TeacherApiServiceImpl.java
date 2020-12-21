package com.fy.two.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.fy.two.api.ITeacherApi;
import com.fy.two.api.TwoBaseService;
import com.fy.two.common.TeacherDto;
import com.fy.two.repository.entity.Teacher;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

/**
 * @author jack
 */
@Service
@Component
public class TeacherApiServiceImpl extends TwoBaseService implements ITeacherApi {

    @Override
    public TeacherDto getTeacherById(Long teacherId) {
        Teacher teacher = teacherRepository.getTeacherById(teacherId);
        TeacherDto teacherDto = new TeacherDto();
        BeanUtils.copyProperties(teacher, teacherDto);
        return teacherDto;
    }
}
