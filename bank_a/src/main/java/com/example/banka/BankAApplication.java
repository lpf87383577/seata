package com.example.banka;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages="com.example.banka.ext")
@MapperScan("com.example.banka.dao.mapper")
public class BankAApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankAApplication.class, args);
    }

}
