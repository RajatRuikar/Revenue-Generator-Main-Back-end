package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.model.Material;

public interface MaterialRepo extends JpaRepository<Material, Integer> {
	
	 @Query("SELECT SUM(m.materialPrice * m.materialQuantityInStock) FROM Material m")
	 public float sumMaterialValues();
	 
	 @Query("SELECT SUM(m.materialPrice * m.materialQuantityInStock) FROM Material m where m.paymentIs='Pending'")
	 public float materialPaymentPaid();

	 @Query("SELECT SUM(m.materialPrice * m.materialQuantityInStock) FROM Material m  where m.paymentIs='Paid'")
	 public float materialPaymentPending();
}
