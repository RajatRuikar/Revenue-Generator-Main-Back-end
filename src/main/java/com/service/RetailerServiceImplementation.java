package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.RetailerRepo;
import com.model.Retailer;

@Service
public class RetailerServiceImplementation implements RetailerService {
	
	@Autowired
	RetailerRepo rr;

	@Override
	public void saveRetailer(Retailer r) {
		rr.save(r);
		
	}

	@Override
	public Retailer getRetailer(int id) {
		return rr.findById(id).orElse(null);
	}

	@Override
	public List<Retailer> getAllRetailer() {
		return rr.findAll();
	}

	@Override
	public Retailer updateRetailer(Retailer r, int id) {
		Retailer r1 = rr.findById(id).orElse(null);
		if(r1== null) {
			return null;
		}
		r1.setRetailerName(r.getRetailerName());
		r1.setRetailerContactNumber(r.getRetailerContactNumber());
		r1.setRetailerEmail(r.getRetailerEmail());
		r1.setRetailerAdditionalDetails(r.getRetailerAdditionalDetails());
		
		rr.save(r1);
		return r1;
	}

	@Override
	public Retailer deleteRetailer(int id) {
		Retailer r = rr.findById(id).orElse(null);
		rr.delete(r);
		return r;
	}

}
