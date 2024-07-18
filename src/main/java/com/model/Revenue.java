package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Revenue {
	@Id
	private int id = 1;
	private float investment;
	private float gainOrLoss;
	private float sumOfEmployeeSalary;
	private float investmentOnMaterial;
	private float materialPaymentPaid;
	private float materialPaymentPending;
	private float customerPaymentRecieve;
	private float customerPaymentPending;

	public Revenue() {
		super();
	}

	public Revenue(int id, float investment, float gainOrLoss, float sumOfEmployeeSalary, float investmentOnMaterial,
			float materialPaymentPaid, float materialPaymentPending, float customerPaymentRecieve,
			float customerPaymentPending) {
		super();
		this.id = id;
		this.investment = investment;
		this.gainOrLoss = gainOrLoss;
		this.sumOfEmployeeSalary = sumOfEmployeeSalary;
		this.investmentOnMaterial = investmentOnMaterial;
		this.materialPaymentPaid = materialPaymentPaid;
		this.materialPaymentPending = materialPaymentPending;
		this.customerPaymentRecieve = customerPaymentRecieve;
		this.customerPaymentPending = customerPaymentPending;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getInvestment() {
		return investment;
	}

	public void setInvestment(float investment) {
		this.investment = investment;
	}

	public float getGainOrLoss() {
		return gainOrLoss;
	}

	public void setGainOrLoss(float gainOrLoss) {
		this.gainOrLoss = gainOrLoss;
	}

	public float getSumOfEmployeeSalary() {
		return sumOfEmployeeSalary;
	}

	public void setSumOfEmployeeSalary(float sumOfEmployeeSalary) {
		this.sumOfEmployeeSalary = sumOfEmployeeSalary;
	}

	public float getInvestmentOnMaterial() {
		return investmentOnMaterial;
	}

	public void setInvestmentOnMaterial(float investmentOnMaterial) {
		this.investmentOnMaterial = investmentOnMaterial;
	}

	public float getMaterialPaymentPaid() {
		return materialPaymentPaid;
	}

	public void setMaterialPaymentPaid(float materialPaymentPaid) {
		this.materialPaymentPaid = materialPaymentPaid;
	}

	public float getMaterialPaymentPending() {
		return materialPaymentPending;
	}

	public void setMaterialPaymentPending(float materialPaymentPending) {
		this.materialPaymentPending = materialPaymentPending;
	}

	public float getCustomerPaymentRecieve() {
		return customerPaymentRecieve;
	}

	public void setCustomerPaymentRecieve(float customerPaymentRecieve) {
		this.customerPaymentRecieve = customerPaymentRecieve;
	}

	public float getCustomerPaymentPending() {
		return customerPaymentPending;
	}

	public void setCustomerPaymentPending(float customerPaymentPending) {
		this.customerPaymentPending = customerPaymentPending;
	}

}
