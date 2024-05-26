package com.cydeo.repository;

import com.cydeo.model.Customer;
import com.cydeo.model.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
