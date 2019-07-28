package com.fy.dubbo_studyone.bpi.impl;

import com.fy.dubbo_studyone.bpi.IOneTestBpi;
import org.springframework.stereotype.Service;

/**
 * @Auther: fangyang
 * @Date: 2019/7/27 13:47
 * @Description:
 */
@Service("oneTestBpi")
public class OneTestBpiServiceImpl implements IOneTestBpi {
    @Override
    public String sayHello(String name, int age) {
        return "【IOneTestBpi】 " + name + " " + age;
    }
}
