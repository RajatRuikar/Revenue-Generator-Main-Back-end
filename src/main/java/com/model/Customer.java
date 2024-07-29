package com.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerId;
	private String customerName;
	private String customerPhoneNumber;
	private String customerEmail;
	private String customerAddress;
	private String paymentIs;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "customer_product_in_cart", joinColumns = @JoinColumn(name = "customer_id"), inverseJoinColumns = @JoinColumn(name = "product_id"))
	private List<ProductInCart> ProductInCart;

	public Customer() {
		super();
	}

	public Customer(int customerId, String customerName, String customerPhoneNumber, String customerEmail,
			String customerAddress, String paymentIs, List<com.model.ProductInCart> productInCart) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerPhoneNumber = customerPhoneNumber;
		this.customerEmail = customerEmail;
		this.customerAddress = customerAddress;
		this.paymentIs = paymentIs;
		ProductInCart = productInCart;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}

	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public List<ProductInCart> getProductInCart() {
		return ProductInCart;
	}

	public void setProductInCart(List<ProductInCart> productInCart) {
		ProductInCart = productInCart;
	}

	public String getPaymentIs() {
		return paymentIs;
	}

	public void setPaymentIs(String paymentIs) {
		this.paymentIs = paymentIs;
	}

}