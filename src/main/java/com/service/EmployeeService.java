package com.service;

import java.util.List;

import com.model.Employee;
import com.model.Product;

public interface EmployeeService {

	public void saveEmployee(Employee e);
	
	public Employee getEmployee(int id);
	
	public List<Employee> getAllEmployee();
	
	public Employee updateEmployee(Employee e, int id);
	
	public Employee deleteEmployee(int id);
	
	public List<Product> getAllProduct();
}
