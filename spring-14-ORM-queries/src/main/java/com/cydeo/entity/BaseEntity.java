package com.cydeo.entity;

import javax.persistence.*;

@MappedSuperclass
public class BaseEntity {

    @Id
    private Long id;
}
