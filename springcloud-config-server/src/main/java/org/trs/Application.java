package org.trs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author Tang Rongsheng
 * @date 2020-04-07
 */
@SpringBootApplication
@EnableConfigServer //启用spring cloud config 服务
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
