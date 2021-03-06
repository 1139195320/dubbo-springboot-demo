package com.fy.two.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.fy.two.api.ITwoTestApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author jack
 */
@Service(interfaceClass = ITwoTestApi.class)
@Component
@Slf4j
public class TwoTestApiServiceImpl implements ITwoTestApi {
    @Override
    public String sayHello(String name) {
        log.info("【ITwoTestApi】被调用 ... ");
        return "【ITwoTestApi】 " + name;
    }
}
