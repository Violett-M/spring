package com.cydeo;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Java {

    //Field Injection
//    @Autowired
//    OfficeHours officeHours;


    //Constructor Injection
   // @Autowired -
//    public Java(OfficeHours officeHours) {
//        this.officeHours = officeHours;
//    }

    OfficeHours officeHours;
    public void getTeachingHours(){
        System.out.println("Weekly teaching hours : " + (20 + officeHours.getHours()));
    }
}
