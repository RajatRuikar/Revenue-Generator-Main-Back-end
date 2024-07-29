package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.model.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{

//    @Query("SELECT SUM(p.productPrice) FROM Customer c JOIN c.product p WHERE c.paymentIs = 'Pending'")
//    public Float sumOfProductsForPendingCustomers();
//
//    @Query("SELECT SUM(p.productPrice) FROM Customer c JOIN c.product p WHERE c.paymentIs = 'Receive'")
//    public Float sumOfProductsForPaidCustomers();
}
