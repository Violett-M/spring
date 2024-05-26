package com.cydeo.entity;

import com.cydeo.enums.Gender;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "employees")
@NoArgsConstructor
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeId;

    private String firstName;
    private String lastName;
    private String email;

    @Column(columnDefinition = "DATE")
    private LocalDate hireDate;

    private String department;

    @Enumerated(EnumType.STRING)
    private Gender gender;
    private int salary;
    private int regionId;


    public Employee(String firstName, String lastName, String email, LocalDate hireDate, String department, Gender gender, int salary, int regionId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.hireDate = hireDate;
        this.department = department;
        this.gender = gender;
        this.salary = salary;
        this.regionId = regionId;
    }
}
