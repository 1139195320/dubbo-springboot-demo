package com.fy.one.common;

import java.io.Serializable;

/**
 * @author jack
 */
public class StuDto implements Serializable {
    private Long id;
    private String stuName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }
}
