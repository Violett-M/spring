package com.cydeo.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ConfigApp {
    @Bean
    FullTimeMentor fullTimeMentor(){
        return new FullTimeMentor();
    }

    @Bean(name = "p1")
    PartTimeMentor partTimeMentor(){
        return new PartTimeMentor();
    }

    // What if we want to handle multiple objects from one POJO class?
    // we can provide name to @Bean as a parameter

    @Bean(name = "p2")
    PartTimeMentor partTimeMentor2(){ return new PartTimeMentor();}

    //@Primary annotation makes a bean default if name is not specified

    @Bean
    PartTimeMentor partTimeMentor3(){
        return new PartTimeMentor();
    }

    @Bean
    @Primary
    PartTimeMentor partTimeMentor4(){
        return new PartTimeMentor();
    }

}
