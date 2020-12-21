package com.fy.one.bpi.impl;

import com.fy.one.bpi.IOneTestBpi;
import org.springframework.stereotype.Service;

/**
 * @author jack
 */
@Service("oneTestBpi")
public class OneTestBpiServiceImpl implements IOneTestBpi {
    @Override
    public String sayHello(String name, int age) {
        return "【IOneTestBpi】 " + name + " " + age;
    }
}
