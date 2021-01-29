package com.smallBase;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.smallBase.craftMapper")
public class SmallCraftApplication {
    public static void main(String[] args) {
        SpringApplication.run(SmallCraftApplication.class,args);
    }
}
