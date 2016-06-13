package com.hexu.springboottest;

import com.hexu.springboottest.config.JerseyConfig;
import com.hexu.springboottest.rest.RestResource;
import org.glassfish.jersey.servlet.ServletContainer;
import org.glassfish.jersey.servlet.ServletProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by hexu on 2016/6/3.
 */

//@Configuration
@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
@ServletComponentScan
//@ComponentScan(basePackageClasses = {RestResource.class})
public class Application {
    public static void main(String[] args) {
        new SpringApplication("classpath:etc/spring-root.xml",Application.class).run(args);
    }

    @Bean
    public ServletRegistrationBean jerseyServlet() {
        ServletRegistrationBean registration = new ServletRegistrationBean(new ServletContainer(), "/rest/*");
        registration.addInitParameter(ServletProperties.JAXRS_APPLICATION_CLASS, JerseyConfig.class.getName());
        return registration;
    }

}
