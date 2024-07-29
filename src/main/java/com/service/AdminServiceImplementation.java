package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AdminRepo;
import com.dao.CustomerRepo;
import com.dao.EmployeeRepo;
import com.dao.MaterialRepo;
import com.dao.RevenueRepo;
import com.model.Admin;
import com.model.Revenue;

@Service
public class AdminServiceImplementation implements AdminService {
	@Autowired
	AdminRepo ar;

	@Autowired
	RevenueRepo rr;

	@Autowired
	EmployeeRepo er;

	@Autowired
	MaterialRepo mr;

	@Autowired
	CustomerRepo cr;

	@Override
	public Admin getAdminDetails() {
		return ar.findById(1).orElse(null);
	}

	@Override
	public Admin setAdmin(Admin a) {
		Admin a1 = ar.findById(1).orElse(null);
		a1.setAdminName(a.getAdminName());
		a1.setAdminEmail(a.getAdminEmail());
		a1.setAdminContactNumber(a.getAdminContactNumber());
		a1.setAdminInverstment(a.getAdminInverstment());
		ar.save(a1);
		return a1;
	}

	@Override
	public Revenue getRevenue() {
		Revenue r = rr.findById(1).orElse(null);
		r.setInvestment(ar.findById(1).orElse(null).getAdminInverstment());
		r.setCustomerPaymentRecieve(0);
		r.setCustomerPaymentPending(0);
		r.setSumOfEmployeeSalary(0);
		r.setInvestmentOnMaterial(0);
		r.setMaterialPaymentPaid(0);
		r.setMaterialPaymentPending(0);

		if (er.sumEmployeeSalaries() != null) {
			r.setSumOfEmployeeSalary(er.sumEmployeeSalaries());
		}
		if (mr.sumMaterialValues() != null) {
			r.setInvestmentOnMaterial(mr.sumMaterialValues());
		}
		if (mr.materialPaymentPaid() != null) {
			r.setMaterialPaymentPaid(mr.materialPaymentPaid());
		}
		if (mr.materialPaymentPending() != null) {
			r.setMaterialPaymentPending(mr.materialPaymentPending());
		}
//		if (cr.sumOfProductsForPaidCustomers() != null) {
//			r.setCustomerPaymentRecieve(cr.sumOfProductsForPaidCustomers());
//		}
//		if (cr.sumOfProductsForPendingCustomers() != null) {
//			r.setCustomerPaymentPending(cr.sumOfProductsForPendingCustomers());
//		}
		rr.save(r);
		r.setGainOrLoss(r.getInvestment() - r.getSumOfEmployeeSalary() - r.getInvestmentOnMaterial()
				+ r.getCustomerPaymentPending() + r.getCustomerPaymentRecieve());
		rr.save(r);
		return r;

	}

}
