package org.trs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.trs.service.HelloService;

/**
 * @author Tang Rongsheng
 * @date 2020-04-07
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/hi")
    public String hello(String name) {
        return helloService.hi(name);
    }
}
