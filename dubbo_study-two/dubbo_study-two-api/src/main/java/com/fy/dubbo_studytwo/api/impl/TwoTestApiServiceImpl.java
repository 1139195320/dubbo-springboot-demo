package com.fy.dubbo_studytwo.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.fy.dubbo_studytwo.api.ITwoTestApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @Auther: fangyang
 * @Date: 2019/7/26 18:49
 * @Description:
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
