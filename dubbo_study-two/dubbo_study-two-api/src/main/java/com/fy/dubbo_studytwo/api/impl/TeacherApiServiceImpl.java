package com.fy.dubbo_studytwo.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.fy.dubbo_studytwo.api.ITeacherApi;
import com.fy.dubbo_studytwo.api.TwoBaseService;
import com.fy.dubbo_studytwo.common.TeacherDto;
import com.fy.dubbo_studytwo.repository.entity.Teacher;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

/**
 * @Auther: fangyang
 * @Date: 2019/7/27 16:31
 * @Description:
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
