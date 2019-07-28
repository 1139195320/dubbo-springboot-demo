package com.fy.dubbo_studytwo.repository.repository;

import com.fy.dubbo_studytwo.repository.entity.Teacher;

/**
 * @Auther: fangyang
 * @Date: 2019/7/27 16:26
 * @Description:
 */
public interface ITeacherRepository {

    Teacher getTeacherById(Long teacherId);
}
