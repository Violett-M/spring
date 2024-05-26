package com.cydeo.entity;

import com.cydeo.enums.Gender;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name="students") //change table name
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "StudentFirstName")
    private String firstName; //first_name

    @Column(name = "StudentLastName")
    private String lastName;
    private String email;

    @Transient //hides field from the table
    private String city;

    @Column(columnDefinition = "DATE")
    private LocalDate birthDate;

    @Column(columnDefinition = "TIME")
    private LocalTime birthTime;

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDate birthDateTime;

    @Enumerated(EnumType.STRING)
    private Gender gender;
}
