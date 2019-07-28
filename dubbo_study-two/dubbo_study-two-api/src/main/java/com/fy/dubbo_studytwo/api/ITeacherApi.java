package com.fy.dubbo_studytwo.api;

import com.fy.dubbo_studytwo.common.TeacherDto;

/**
 * @Auther: fangyang
 * @Date: 2019/7/27 16:30
 * @Description:
 */
public interface ITeacherApi {

    TeacherDto getTeacherById(Long teacherId);
}
