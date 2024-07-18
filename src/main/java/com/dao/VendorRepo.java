package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Vendor;

public interface VendorRepo extends JpaRepository<Vendor, Integer>{

}
