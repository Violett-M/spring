package com.cydeo.stereotype_annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan
//If we want @ComponentScan to search @Component in different package
//We can use parameter basePackages
@ComponentScan(basePackages = "com.cydeo") // will check all classes with @Component under "cydeo" package
public class ConfigCourse {

    // Note:
    // If a class doesn't belong to us, we need to follow @Bean way to create beans from these classes


}
