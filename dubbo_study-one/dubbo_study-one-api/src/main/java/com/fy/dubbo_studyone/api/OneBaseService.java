package com.fy.dubbo_studyone.api;

import com.fy.dubbo_studyone.repository.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Auther: fangyang
 * @Date: 2019/7/27 16:08
 * @Description:
 */
public class OneBaseService {

    @Autowired
    protected IStudentRepository studentRepository;
}
