package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.model.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{

//	 @Query("SELECT SUM() FROM Customer c where c.paymentIs='Paid'")
//	 public float CustomerPaymentPending();
}
