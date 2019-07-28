package com.fy.dubbo_studyone.api;

import com.fy.dubbo_studyone.common.StuDto;

/**
 * @Auther: fangyang
 * @Date: 2019/7/27 16:04
 * @Description:
 */
public interface IStudentApi {

    StuDto getStuById(Long stuId);
}
