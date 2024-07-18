package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productId;
	private String productName;
	private String productDescription;
	private float productPrice;
	private String productExpireDate;
	private int productQuantityInStock;

	public Product() {
		super();
	}

	public Product(int productId, String productName, String productDescription, float productPrice,
			String productExpireDate, int productQuantityInStock) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
		this.productExpireDate = productExpireDate;
		this.productQuantityInStock = productQuantityInStock;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public float getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductExpireDate() {
		return productExpireDate;
	}

	public void setProductExpireDate(String productExpireDate) {
		this.productExpireDate = productExpireDate;
	}

	public int getProductQuantityInStock() {
		return productQuantityInStock;
	}

	public void setProductQuantityInStock(int productQuantityInStock) {
		this.productQuantityInStock = productQuantityInStock;
	}

}
