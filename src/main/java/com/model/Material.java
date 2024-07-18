package com.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Material {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int materialId;
	private String materialName;
	private String materialImportDate;
	private int materialQuantityInStock;
	private float materialPrice;
	private String materialDescription;
	private String paymentIs;

	@ManyToMany(fetch = FetchType.EAGER)
	private List<Vendor> vendor;

	public Material() {
		super();
	}

	public Material(int materialId, String materialName, String materialImportDate, int materialQuantityInStock,
			float materialPrice, String materialDescription, String paymentIs, List<Vendor> vendor) {
		super();
		this.materialId = materialId;
		this.materialName = materialName;
		this.materialImportDate = materialImportDate;
		this.materialQuantityInStock = materialQuantityInStock;
		this.materialPrice = materialPrice;
		this.materialDescription = materialDescription;
		this.paymentIs = paymentIs;
		this.vendor = vendor;
	}

	public int getMaterialId() {
		return materialId;
	}

	public void setMaterialId(int materialId) {
		this.materialId = materialId;
	}

	public String getMaterialName() {
		return materialName;
	}

	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}

	public String getMaterialImportDate() {
		return materialImportDate;
	}

	public void setMaterialImportDate(String materialImportDate) {
		this.materialImportDate = materialImportDate;
	}

	public int getMaterialQuantityInStock() {
		return materialQuantityInStock;
	}

	public void setMaterialQuantityInStock(int materialQuantityInStock) {
		this.materialQuantityInStock = materialQuantityInStock;
	}

	public float getMaterialPrice() {
		return materialPrice;
	}

	public void setMaterialPrice(float materialPrice) {
		this.materialPrice = materialPrice;
	}

	public String getMaterialDescription() {
		return materialDescription;
	}

	public void setMaterialDescription(String materialDescription) {
		this.materialDescription = materialDescription;
	}

	public List<Vendor> getVendor() {
		return vendor;
	}

	public void setVendor(List<Vendor> vendor) {
		this.vendor = vendor;
	}

	public String getPaymentIs() {
		return paymentIs;
	}

	public void setPaymentIs(String paymentIs) {
		this.paymentIs = paymentIs;
	}

}
