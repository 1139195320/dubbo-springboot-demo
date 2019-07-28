package com.fy.dubbo_studyone.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.fy.dubbo_studyone.api.IStudentApi;
import com.fy.dubbo_studyone.api.OneBaseService;
import com.fy.dubbo_studyone.common.StuDto;
import com.fy.dubbo_studyone.repository.entity.Student;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

/**
 * @Auther: fangyang
 * @Date: 2019/7/27 16:07
 * @Description:
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
