package org.trs.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Tang Rongsheng
 * @date 2020-04-03
 */
@RestController
public class ControllerDemo {

    @Value("${server.port}")
    private String port;

    @GetMapping("/hi")
    public String hi(String name) {
        return String.format("hello %s , from port=%s", name, port);
    }
}
