package com.fy.one.repository.repository.impl;

import com.fy.one.repository.entity.Student;
import com.fy.one.repository.repository.IStudentRepository;
import org.springframework.stereotype.Repository;

/**
 * @author jack
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
