package com.hexu.springboottest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by hexu on 2016/6/3.
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
