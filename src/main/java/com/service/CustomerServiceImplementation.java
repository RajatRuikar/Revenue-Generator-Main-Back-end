package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AdminRepo;
import com.dao.CustomerRepo;
import com.dao.ProductRepo;
import com.model.Admin;
import com.model.Customer;
import com.model.Product;

@Service
public class CustomerServiceImplementation implements CustomerService {

	@Autowired
	CustomerRepo cr;
	
	@Autowired 
	AdminRepo ar;
	
	@Autowired
	ProductRepo pr;

	@Override
	public void saveCustomer(Customer c) {
		cr.save(c);
		Admin a = ar.findById(1).orElse(null);
		List<Customer> customers = a.getCustomer();
		customers.add(c);
		ar.save(a);
	}

	@Override
	public Customer getCustomer(int id) {
		return cr.findById(id).orElse(null);
	}

	@Override
	public List<Customer> getAllCustomer() {
		return cr.findAll();
	}

	@Override
	public Customer updateCustomer(Customer c, int id) {
		Customer c1 = cr.findById(id).orElse(null);
		if(c1==null){
			return null;
		}
		c1.setCustomerName(c.getCustomerName());
		c1.setCustomerPhoneNumber(c.getCustomerPhoneNumber());
		c1.setCustomerEmail(c.getCustomerEmail());
		c1.setCustomerAddress(c.getCustomerAddress());
		c1.setPaymentIs(c.getPaymentIs());
		cr.save(c1);
		return c1;
		
	}

	@Override
	public Customer deleteCustomer(int id) {
		Customer c = cr.findById(id).orElse(null);
		cr.delete(c);
		return c;
	}

	@Override
	public List<Product> getAllProduct() {
		return pr.findAll();
	}
	
	
}
