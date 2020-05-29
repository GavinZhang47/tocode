package com.example.tocode;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.tocode.code.dao")//D:\Programming\workspace\tocode\src\main\java\com\example\tocode\code\dao

public class TocodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(TocodeApplication.class, args);
    }

}
