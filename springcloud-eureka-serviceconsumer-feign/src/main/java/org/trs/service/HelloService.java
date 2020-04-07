package org.trs.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 服务调用
 *
 * @author Tang Rongsheng
 * @date 2020-04-07
 */

/**
 * 通过FeignClient配置负载均衡，指定了服务提供者的名字
 */
@FeignClient(value = "springcloud-eureka-serviceprovider", fallback = HelloServiceHystrix.class)
public interface HelloService {
    /**
     * 这里指定调用的rest URL
     */
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String hi(@RequestParam(value = "name") String name);
}

