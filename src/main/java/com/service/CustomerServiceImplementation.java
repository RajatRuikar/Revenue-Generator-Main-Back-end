package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AdminRepo;
import com.dao.CustomerRepo;
import com.model.Customer;

@Service
public class CustomerServiceImplementation implements CustomerService {

	@Autowired
	CustomerRepo cr;
	
	@Autowired 
	AdminRepo ar;

	@Override
	public void saveCustomer(Customer c) {
//		Admin a = ar.findById(1).orElse(null);
//		c.setAdmin(a);
//		a.getCustomer().add(c);
		cr.save(c);
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
	
	
}
