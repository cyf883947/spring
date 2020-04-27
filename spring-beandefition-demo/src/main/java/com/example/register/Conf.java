package com.example.register;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author cyf
 * @description
 * @create 2020-04-27 9:29
 **/
@Component
public class Conf {

    @Bean
    public User user(){
        User user = new User();
        user.setId("1");
        user.setName("cyf");
        return user;
    }

}
