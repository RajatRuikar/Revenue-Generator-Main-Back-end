package com.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Admin {
	@Id
	private int adminId=1;
	private String adminName;
	private String adminEmail;
	private String adminContactNumber;
	private float adminInverstment;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Customer> customer;
	
	@OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	private List<Employee> employee;

	public Admin() {
		super();
	}

	public Admin(int adminId, String adminName, String adminEmail, String adminContactNumber, float adminInverstment,
			List<Customer> customer, List<Employee> employeee) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminEmail = adminEmail;
		this.adminContactNumber = adminContactNumber;
		this.adminInverstment = adminInverstment;
		this.customer = customer;
		this.employee = employeee;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminEmail() {
		return adminEmail;
	}

	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}

	public String getAdminContactNumber() {
		return adminContactNumber;
	}

	public void setAdminContactNumber(String adminContactNumber) {
		this.adminContactNumber = adminContactNumber;
	}

	public float getAdminInverstment() {
		return adminInverstment;
	}

	public void setAdminInverstment(float adminInverstment) {
		this.adminInverstment = adminInverstment;
	}

	public List<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}

	public List<Employee> getEmployeee() {
		return employee;
	}

	public void setEmployeee(List<Employee> employee) {
		this.employee = employee;
	}

}