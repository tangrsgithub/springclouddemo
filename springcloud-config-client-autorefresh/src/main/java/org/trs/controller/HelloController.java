package org.trs.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Tang Rongsheng
 * @date 2020-04-07
 */
@RestController
public class HelloController {

    //属性注入
    @Value("${name}")
    private String name;

    @RequestMapping(value = "/hi")
    public String hi(){
        return "hi "+name;
    }
}
