package com.fy.one.api;

import com.fy.one.common.StuDto;

/**
 * @author jack
 */
public interface IStudentApi {

    StuDto getStuById(Long stuId);
}
