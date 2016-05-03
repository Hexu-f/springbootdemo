package com.hexu.springboottest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Hexu on 2016/5/3.
 */

//@Configuration
//@ComponentScan
//@EnableAutoConfiguration
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        new SpringApplication("classpath:etc/spring-root.xml",Application.class).run(args);
    }
}
