package com.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class ProductInCart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productInCartId;
	private int productId;
	private String productName;
	private String productDescription;
	private float productPrice;
	private String productExpireDate;

	@ManyToMany(mappedBy = "ProductInCart")
	private List<Customer> customer;
	
	public ProductInCart() {
		super();
	}

	public ProductInCart(int productInCartId, int productId, String productName, String productDescription,
			float productPrice, String productExpireDate) {
		super();
		this.productInCartId = productInCartId;
		this.productId = productId;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
		this.productExpireDate = productExpireDate;
	}

	public int getProductInCartId() {
		return productInCartId;
	}

	public void setProductInCartId(int productInCartId) {
		this.productInCartId = productInCartId;
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

}
