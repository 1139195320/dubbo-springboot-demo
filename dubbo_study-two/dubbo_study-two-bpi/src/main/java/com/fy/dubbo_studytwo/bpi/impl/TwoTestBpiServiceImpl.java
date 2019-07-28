package com.fy.dubbo_studytwo.bpi.impl;

import com.fy.dubbo_studytwo.api.ITwoTestBpi;
import org.springframework.stereotype.Service;

/**
 * @Auther: fangyang
 * @Date: 2019/7/27 14:03
 * @Description:
 */
@Service
public class TwoTestBpiServiceImpl implements ITwoTestBpi {

    @Override
    public String sayHello(String name, int age) {
        return "【TwoTestBpi】 " + name + " " + age;
    }
}
