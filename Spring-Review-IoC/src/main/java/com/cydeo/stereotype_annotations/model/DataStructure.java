package com.cydeo.stereotype_annotations.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import org.springframework.stereotype.Component;

@Component
//@AllArgsConstructor
@Data // If we want to use @Data we need to add @NonNull as well
public class DataStructure {
    @NonNull
    ExtraHours extraHours;

    public void getTotalHours(){
        System.out.println("Total hours " + (30 + extraHours.getHours()));
    }
}
