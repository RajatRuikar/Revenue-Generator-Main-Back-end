package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Retailer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int retailerId;
	private String retailerName;
	private String retailerContactNumber;
	private String retailerEmail;
	private String retailerAdditionalDetails;

	public Retailer() {
		super();
	}

	public Retailer(int retailerId, String retailerName, String retailerContactNumber, String retailerEmail,
			String retailerAdditionalDetails) {
		super();
		this.retailerId = retailerId;
		this.retailerName = retailerName;
		this.retailerContactNumber = retailerContactNumber;
		this.retailerEmail = retailerEmail;
		this.retailerAdditionalDetails = retailerAdditionalDetails;
	}

	public int getRetailerId() {
		return retailerId;
	}

	public void setRetailerId(int retailerId) {
		this.retailerId = retailerId;
	}

	public String getRetailerName() {
		return retailerName;
	}

	public void setRetailerName(String retailerName) {
		this.retailerName = retailerName;
	}

	public String getRetailerContactNumber() {
		return retailerContactNumber;
	}

	public void setRetailerContactNumber(String retailerContactNumber) {
		this.retailerContactNumber = retailerContactNumber;
	}

	public String getRetailerEmail() {
		return retailerEmail;
	}

	public void setRetailerEmail(String retailerEmail) {
		this.retailerEmail = retailerEmail;
	}

	public String getRetailerAdditionalDetails() {
		return retailerAdditionalDetails;
	}

	public void setRetailerAdditionalDetails(String retailerAdditionalDetails) {
		this.retailerAdditionalDetails = retailerAdditionalDetails;
	}

}
