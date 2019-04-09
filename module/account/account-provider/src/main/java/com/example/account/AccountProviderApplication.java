package com.example.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author wangyu
 * 2019/04/09 09:54
 */
@SpringBootApplication
@EnableFeignClients(basePackages = {"com.example.account.service"})
@EnableEurekaClient
public class AccountProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(AccountProviderApplication.class, args);
    }
}
