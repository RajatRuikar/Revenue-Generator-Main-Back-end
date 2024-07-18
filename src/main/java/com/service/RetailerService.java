package com.service;

import java.util.List;

import com.model.Retailer;

public interface RetailerService {
	public void saveRetailer(Retailer r);
	
	public Retailer getRetailer(int id);
	
	public List<Retailer> getAllRetailer();
	
	public Retailer updateRetailer(Retailer r, int id);
	
	public Retailer deleteRetailer(int id);
}
