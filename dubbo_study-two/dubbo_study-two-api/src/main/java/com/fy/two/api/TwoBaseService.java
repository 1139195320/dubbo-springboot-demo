package com.fy.two.api;

import com.fy.two.repository.repository.ITeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author jack
 */
public class TwoBaseService {

    @Autowired
    protected ITeacherRepository teacherRepository;
}
