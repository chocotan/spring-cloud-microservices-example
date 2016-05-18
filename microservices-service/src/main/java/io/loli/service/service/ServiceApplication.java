package io.loli.service.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author choco
 */
@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class ServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class, args);
    }
}

@RestController
class HelloService {

    @RequestMapping("hello")
    @HystrixCommand(fallbackMethod = "errorHandle")
    public String hello() {
        if (Math.random() > 0.7) {
            throw new RuntimeException();
        }
        return "service-hello";
    }

    public String errorHandle(){
        return "error";
    }

}