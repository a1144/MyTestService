package com.test.mytestservice;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.test.mytestservice.datasource.mapper")
public class MyTestServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyTestServiceApplication.class, args);
    }

}
