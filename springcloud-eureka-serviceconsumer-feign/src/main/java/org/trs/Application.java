package org.trs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Tang Rongsheng
 * @date 2020-04-07
 */
@SpringBootApplication
@EnableEurekaClient //启用EurekaClient组件
@EnableFeignClients  //开启Feign的功能
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

