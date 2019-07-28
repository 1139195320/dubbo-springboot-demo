package com.fy.dubbo_studytwo.app.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.fy.dubbo_studyone.api.IOneTestApi;
import com.fy.dubbo_studyone.api.IStudentApi;
import com.fy.dubbo_studyone.api.impl.StudentApiServiceImpl;
import com.fy.dubbo_studyone.common.StuDto;
import com.fy.dubbo_studytwo.api.ITwoTestBpi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: fangyang
 * @Date: 2019/7/27 14:09
 * @Description:
 */
@RestController
@RequestMapping("two")
public class TwoTestController {

    @Autowired
    private ITwoTestBpi twoTestBpi;

    @Reference
    private IOneTestApi oneTestApi;

    @Reference
    private IStudentApi studentApi;

    @RequestMapping("sayHello")
    public String sayHello(){
        return twoTestBpi.sayHello("this is sayHello two test", 18);
    }

    @RequestMapping("oneSayHello")
    public String testOneTestApi(){
        return oneTestApi.sayHello("小明, I'm Two .");
    }

    @RequestMapping("getOneStu")
    public StuDto getOneStu(){
        return studentApi.getStuById(1L);
    }
}
