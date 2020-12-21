package com.fy.one.api;

import com.fy.one.repository.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author jack
 */
public class OneBaseService {

    @Autowired
    protected IStudentRepository studentRepository;
}
