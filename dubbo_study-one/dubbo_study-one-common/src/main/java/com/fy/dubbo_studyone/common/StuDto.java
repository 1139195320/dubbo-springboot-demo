package com.fy.dubbo_studyone.common;

import java.io.Serializable;

/**
 * @Auther: fangyang
 * @Date: 2019/7/27 16:04
 * @Description:
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
