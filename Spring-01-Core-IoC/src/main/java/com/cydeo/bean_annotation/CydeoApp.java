package com.cydeo.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class, ConfigAny.class);

        FullTimeMentor ft = container.getBean(FullTimeMentor.class);
        ft.createAccount();

        String strBean = container.getBean(String.class);
        System.out.println(strBean);

        Integer intBean = container.getBean(Integer.class);
        System.out.println(intBean);

        PartTimeMentor pt = container.getBean("p1",PartTimeMentor.class);
        pt.createAccount();

        System.out.println("-------------------------------");
        PartTimeMentor ptPrimary = container.getBean(PartTimeMentor.class);
        pt.createAccount();


    }
}
