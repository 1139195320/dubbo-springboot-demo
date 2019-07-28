package com.fy.dubbo_studyone.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.fy.dubbo_studyone.api.IOneTestApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @Auther: fangyang
 * @Date: 2019/7/26 18:48
 * @Description:
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