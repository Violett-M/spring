package com.cydeo.stereotype_annotations.config;

import com.cydeo.stereotype_annotations.model.DataStructure;
import com.cydeo.stereotype_annotations.model.MicroService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigApp.class);
        context.getBean(DataStructure.class).getTotalHours();
        context.getBean(MicroService.class).getTotalHours();

    }
}
