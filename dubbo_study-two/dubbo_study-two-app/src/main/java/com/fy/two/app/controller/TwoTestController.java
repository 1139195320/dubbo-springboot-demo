package com.fy.two.app.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.fy.one.api.IOneTestApi;
import com.fy.one.api.IStudentApi;
import com.fy.one.common.StuDto;
import com.fy.two.bpi.ITwoTestBpi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jack
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
