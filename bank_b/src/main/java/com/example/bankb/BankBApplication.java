package com.example.bankb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.example.bankb.dao.mapper")
public class BankBApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankBApplication.class, args);
    }

}