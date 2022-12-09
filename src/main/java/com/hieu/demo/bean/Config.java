package com.hieu.demo.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.annotation.SessionScope;

@Configuration
public class Config {

    @Bean
    public User userSingleton() {
        return new User();
    }

//    @Bean
//    @SessionScope
//    public User userSessionScope() {
//        return new User();
//    }
//
//    @Bean
//    @Scope(value = "prototype")
//    public User userPrototypeScope() {
//        return new User();
//    }
//
//    @Bean
//    @Scope(value = "request")
//    public User userRequestScope() {
//        return new User();
//    }
}
