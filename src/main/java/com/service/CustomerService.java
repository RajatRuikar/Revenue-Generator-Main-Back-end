package com.service;

import java.util.List;

import com.model.Customer;

public interface CustomerService {
	public void saveCustomer(Customer c);
	
	public Customer getCustomer(int id);
	
	public List<Customer> getAllCustomer();
	
	public Customer updateCustomer(Customer c,int id);
	
	public Customer deleteCustomer(int id);
	
	
}
