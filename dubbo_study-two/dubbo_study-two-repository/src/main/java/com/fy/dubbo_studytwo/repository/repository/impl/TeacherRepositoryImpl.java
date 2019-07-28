package com.fy.dubbo_studytwo.repository.repository.impl;

import com.fy.dubbo_studytwo.repository.entity.Teacher;
import com.fy.dubbo_studytwo.repository.repository.ITeacherRepository;
import org.springframework.stereotype.Repository;

/**
 * @Auther: fangyang
 * @Date: 2019/7/27 16:27
 * @Description:
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
