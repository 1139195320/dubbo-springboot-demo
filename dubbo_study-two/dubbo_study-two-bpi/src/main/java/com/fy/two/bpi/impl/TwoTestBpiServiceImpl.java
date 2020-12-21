package com.fy.two.bpi.impl;

import com.fy.two.bpi.ITwoTestBpi;
import org.springframework.stereotype.Service;

/**
 * @author jack
 */
@Service
public class TwoTestBpiServiceImpl implements ITwoTestBpi {

    @Override
    public String sayHello(String name, int age) {
        return "【TwoTestBpi】 " + name + " " + age;
    }
}
