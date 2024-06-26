package com.cydeo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "customers")
@Data
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String surName;
    private String userName;
    private String email;
    private String address;

    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
    private List<Payment> payment;

    public Customer(String name, String surName, String userName, String email, String address) {
        this.name = name;
        this.surName = surName;
        this.userName = userName;
        this.email = email;
        this.address = address;
    }
}
