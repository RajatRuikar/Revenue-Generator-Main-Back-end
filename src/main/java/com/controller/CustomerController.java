package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Customer;
import com.model.Product;
import com.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	CustomerService cs;
	
	@PostMapping("/addcustomer")
	public void addCustomer(@RequestBody Customer c) {
		cs.saveCustomer(c);
	}
	
	@GetMapping("/getallcustomer")
	public List<Customer> getAllCustomer() {
		return cs.getAllCustomer();
	}
	
	@GetMapping("/getcustomer/{id}")
	public Customer getCustomer(@PathVariable int id) {
		return cs.getCustomer(id);
	}
	
	@DeleteMapping("/deletecustomer/{id}")
	public Customer deleteCustomer(@PathVariable int id) {
		return cs.deleteCustomer(id);
	}
	
	@PutMapping("updatecustomer/{id}")
	public Customer updateCustomer(@PathVariable int id, @RequestBody Customer c) {
		return cs.updateCustomer(c, id);
	}
	
	@GetMapping("{id}/allproduct")
	public List<Product> getMethodName(@PathVariable int id) {
		return cs.getAllProduct();
	}
	
}	
