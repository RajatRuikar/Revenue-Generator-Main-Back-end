package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.EmployeeRepo;
import com.model.Employee;

@Service
public class EmployeeServiceImplementation implements EmployeeService {
	
	@Autowired
	EmployeeRepo er;

	@Override
	public void saveEmployee(Employee e) {
		er.save(e);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return er.findAll();
	}

	@Override
	public Employee updateEmployee(Employee e, int id) {
		Employee e1 = er.findById(id).orElse(null);
		if(e1 == null) {
			return null;
		}
		e1.setEmployeeName(e.getEmployeeName());
		e1.setEmployeeRole(e.getEmployeeRole());
		e1.setEmployeePhoneNumber(e.getEmployeePhoneNumber());
		e1.setEmployeeEmail(e.getEmployeeEmail());
		e1.setEmployeeAddress(e.getEmployeeAddress());
		e1.setEmployeeSalary(e.getEmployeeSalary());
		e1.setDateOfJoining(e.getDateOfJoining());
		er.save(e1);
		return e1;
	}

	@Override
	public Employee deleteEmployee(int id) {
		Employee e = er.findById(id).orElse(null);
		er.delete(e);
		return e;
	}

	@Override
	public Employee getEmployee(int id) {
		return er.findById(id).orElse(null);
	}
	
	
}
