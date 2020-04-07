package org.trs.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Tang Rongsheng
 * @date 2020-04-03
 */
@RestController
public class HelloController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/hi")
    @HystrixCommand(fallbackMethod = "hiFallBack")
    public String hi(String name){
        //这里直接写的是服务名： springcloud-eureka-serviceprovider
        //在ribbon中它会根据服务名来选择具体的服务实例，根据服务实例在请求的时候会用具体的url替换掉服务名
        return restTemplate.getForObject("http://springcloud-eureka-serviceprovider/hi?name=" + name, String.class);
    }

    /**
     *  hiFallBack的方法声明要与上面hi的声明一致
     *
     * @param name
     * @return java.lang.String
     */
    public String hiFallBack(String name) {
        return "ribbon fall back. " + name;
    }
}
