package org.trs.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @author Tang Rongsheng
 * @date 2020-04-15
 */
@RestController
@RequestMapping("hello")
public class HelloController {

    @RequestMapping("a")
    public Mono<String> a() {
        System.out.println("aaaaaaaa");
        return Mono.just("aa");
    }
    @RequestMapping("b")
    public Mono<String> b() {
        System.out.println("bbbbb");
        return Mono.just("bb");
    }
}
