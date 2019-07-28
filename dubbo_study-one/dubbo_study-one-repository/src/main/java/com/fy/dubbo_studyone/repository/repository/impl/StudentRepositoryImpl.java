package com.fy.dubbo_studyone.repository.repository.impl;

import com.fy.dubbo_studyone.repository.entity.Student;
import com.fy.dubbo_studyone.repository.repository.IStudentRepository;
import org.springframework.stereotype.Repository;

/**
 * @Auther: fangyang
 * @Date: 2019/7/27 16:01
 * @Description:
 */
@Repository
public class StudentRepositoryImpl implements IStudentRepository {

    @Override
    public Student getStuById(Long id) {
        Student student = new Student();
        student.setId(id);
        student.setStuName("default student");
        return student;
    }
}
