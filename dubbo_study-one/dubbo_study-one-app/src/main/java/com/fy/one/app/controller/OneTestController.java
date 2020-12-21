package com.fy.one.app.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.fy.one.bpi.IOneTestBpi;
import com.fy.two.api.ITeacherApi;
import com.fy.two.api.ITwoTestApi;
import com.fy.two.common.TeacherDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jack
 */
@RestController
@RequestMapping("one")
public class OneTestController {

    @Autowired
    private IOneTestBpi oneTestBpi;

    @Reference
    private ITwoTestApi twoTestApi;

    @Reference
    private ITeacherApi teacherApi;

    @RequestMapping("sayHello")
    public String sayHello() {
        return oneTestBpi.sayHello("this is sayHello one test", 18);
    }

    @RequestMapping("twoSayHello")
    public String testOneTestApi() {
        return twoTestApi.sayHello("张三, I'm One .");
    }

    @RequestMapping("getTwoTeacher")
    public TeacherDto getTwoTeacher(){
        return teacherApi.getTeacherById(100L);
    }
}
