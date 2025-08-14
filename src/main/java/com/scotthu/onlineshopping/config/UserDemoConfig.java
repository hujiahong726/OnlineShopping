package com.scotthu.onlineshopping.config;

import com.scotthu.onlineshopping.model.UserDemo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserDemoConfig {

    @Bean(name = "z3")
    public UserDemo defaultUser() {
        return UserDemo.builder()
                .id(0)
                .email("default@gmail.com")
                .name("default").build();
    }

    @Bean(name = "l4")
    public UserDemo defaultUser2() {
        return UserDemo.builder()
                .id(-1)
                .email("L4 user exists")
                .name("li si").build();
    }

}
