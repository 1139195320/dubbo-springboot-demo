package com.fy.dubbo_studytwo.api;

import com.fy.dubbo_studytwo.repository.repository.ITeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Auther: fangyang
 * @Date: 2019/7/27 16:29
 * @Description:
 */
public class TwoBaseService {

    @Autowired
    protected ITeacherRepository teacherRepository;
}
