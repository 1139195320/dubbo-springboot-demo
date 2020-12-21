package com.fy.one.repository.repository;

import com.fy.one.repository.entity.Student;

/**
 * @author jack
 */
public interface IStudentRepository {

    Student getStuById(Long id);
}
