package com.fy.dubbo_studytwo.common;

import java.io.Serializable;

/**
 * @Auther: fangyang
 * @Date: 2019/7/27 16:32
 * @Description:
 */
public class TeacherDto implements Serializable {
    private Long id;
    private String teacherName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}
