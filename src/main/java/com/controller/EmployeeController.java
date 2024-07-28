package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Employee;
import com.model.Product;
import com.service.EmployeeService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	EmployeeService es;
	
	@PostMapping("/addemployee")
	public void addEmployee(@RequestBody Employee e) {
		es.saveEmployee(e);
	}
	
	@GetMapping("/getallemployee")
	public List<Employee> getAllEmployee(){
		return es.getAllEmployee();
	}
	
	@GetMapping("/getemployee/{id}")
	public Employee getEmployee(@PathVariable int id) {
		return es.getEmployee(id);
	}
	
	@DeleteMapping("/deleteemployee/{id}")
	public Employee deleteEmployee(@PathVariable int id) {
		return es.deleteEmployee(id);
	}
	
	@PutMapping("updateemployee/{id}")
	public Employee updateEmployee(@PathVariable int id, @RequestBody Employee e) {
		return es.updateEmployee(e, id);
	}
	
	@GetMapping("{id}/allproduct")
	public List<Product> getMethodName(@PathVariable int id) {
		return es.getAllProduct();
	}
	
}
