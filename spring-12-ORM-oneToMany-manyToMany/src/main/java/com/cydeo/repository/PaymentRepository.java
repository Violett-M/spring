package com.cydeo.repository;

import com.cydeo.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {

    // method  ---> sql ---> derive query  ex: findById(int id) runs query behind scenes

    // sql - @Query

    // JPQL - @Query
}
