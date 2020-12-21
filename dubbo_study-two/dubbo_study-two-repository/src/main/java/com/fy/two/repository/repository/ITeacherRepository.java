package com.fy.two.repository.repository;

import com.fy.two.repository.entity.Teacher;

/**
 * @author jack
 */
public interface ITeacherRepository {

    Teacher getTeacherById(Long teacherId);
}
