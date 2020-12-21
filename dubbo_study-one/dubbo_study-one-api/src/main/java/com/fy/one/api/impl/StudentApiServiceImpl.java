package com.fy.one.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.fy.one.api.IStudentApi;
import com.fy.one.api.OneBaseService;
import com.fy.one.common.StuDto;
import com.fy.one.repository.entity.Student;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

/**
 * @author jack
 */
@Service(interfaceClass = IStudentApi.class)
@Component
public class StudentApiServiceImpl extends OneBaseService implements IStudentApi {

    @Override
    public StuDto getStuById(Long stuId) {
        Student student = studentRepository.getStuById(stuId);
        StuDto stuDto = new StuDto();
        BeanUtils.copyProperties(student, stuDto);
        return stuDto;
    }
}
