package com.fy.two.common;

import java.io.Serializable;

/**
 * @author jack
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
