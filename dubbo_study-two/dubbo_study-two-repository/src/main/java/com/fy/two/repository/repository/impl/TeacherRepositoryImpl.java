package com.fy.two.repository.repository.impl;

import com.fy.two.repository.entity.Teacher;
import com.fy.two.repository.repository.ITeacherRepository;
import org.springframework.stereotype.Repository;

/**
 * @author jack
 */
@Repository
public class TeacherRepositoryImpl implements ITeacherRepository {

    @Override
    public Teacher getTeacherById(Long teacherId) {
        Teacher teacher = new Teacher();
        teacher.setId(teacherId);
        teacher.setTeacherName("default teacher");
        return teacher;
    }
}
