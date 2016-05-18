package io.loli.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author choco
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ZkServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZkServiceApplication.class, args);
    }
}


@RestController
class HelloClient {
    @RequestMapping("zkHello")
    public String hello(){
        return "Hello zk service";
    }
}