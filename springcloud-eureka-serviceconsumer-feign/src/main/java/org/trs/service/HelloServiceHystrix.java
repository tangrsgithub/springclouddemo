package org.trs.service;

import org.springframework.stereotype.Component;

/**
 * @author Tang Rongsheng
 * @date 2020-04-07
 */
@Component
public class HelloServiceHystrix implements HelloService {

    /**
     *  这里方法声明要与HelloService中的一致
     *
     * @param name
     * @return java.lang.String
     */
    @Override
    public String hi(String name) {
        return "feign fall back. " + name;
    }
}
