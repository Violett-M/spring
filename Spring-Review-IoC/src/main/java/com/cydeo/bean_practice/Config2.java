package com.cydeo.bean_practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config2 {

    @Bean
    String str1(){
        return "Welcome to Cydeo";
    }

    @Bean
    String str2(){
        return "Spring Core Practice";
    }


}
