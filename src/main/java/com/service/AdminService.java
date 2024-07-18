package com.service;

import com.model.Admin;
import com.model.Revenue;

public interface AdminService {

	public Admin getAdminDetails();
	
	public Admin setAdmin(Admin a);
	
	public Revenue getRevenue();
}
