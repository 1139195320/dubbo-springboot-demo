package com.fy.two.api;

import com.fy.two.common.TeacherDto;

/**
 * @author jack
 */
public interface ITeacherApi {

    TeacherDto getTeacherById(Long teacherId);
}
