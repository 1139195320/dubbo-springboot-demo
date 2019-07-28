package com.fy.dubbo_studyone.repository.repository;

import com.fy.dubbo_studyone.repository.entity.Student;

/**
 * @Auther: fangyang
 * @Date: 2019/7/27 15:58
 * @Description:
 */
public interface IStudentRepository {

    Student getStuById(Long id);
}
