package com.yaoboxue.rubbish_user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.yaoboxue.rubbish_user.mapper")
public class RubbishUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(RubbishUserApplication.class, args);
    }

}
