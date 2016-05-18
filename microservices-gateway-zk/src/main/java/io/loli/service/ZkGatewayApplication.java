package io.loli.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author choco
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class ZkGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZkGatewayApplication.class, args);
    }
}
