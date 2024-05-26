package com.cydeo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "departments")
@NoArgsConstructor
@Data
public class Department extends BaseEntity {

    private String department;
    private String division;

    // create bidirectional relationship
    @OneToOne(mappedBy = "department") //has to match exactly the field name in Employee class
    // we use mappedBy if we don't want to see the foreign key in current table
    private Employee employee;

    public Department(String department, String division) {
        this.department = department;
        this.division = division;
    }
}
