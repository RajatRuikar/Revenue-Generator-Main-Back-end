package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Admin;
import com.model.Revenue;
import com.service.AdminService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	AdminService as;
	
	@GetMapping("/getAdmin")
	public Admin getAdmin() {
		return as.getAdminDetails();
	}
	
	@PutMapping("/set")
	public void updateAdmin( @RequestBody Admin a) {
		as.setAdmin(a);
	}
	
	@GetMapping("/revenue")
	public Revenue getMethodName() {
		return as.getRevenue();
	}
	

}
