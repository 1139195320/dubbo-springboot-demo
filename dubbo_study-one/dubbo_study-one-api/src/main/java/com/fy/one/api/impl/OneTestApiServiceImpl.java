package com.fy.one.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.fy.one.api.IOneTestApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author jack
 */
@Service(interfaceClass = IOneTestApi.class)
@Component
@Slf4j
public class OneTestApiServiceImpl implements IOneTestApi {
    @Override
    public String sayHello(String name) {
        log.info("【IOneTestApi】被调用 ... ");
        return "【IOneTestApi】 " + name;
    }
}
