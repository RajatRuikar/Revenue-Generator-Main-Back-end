package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

	@Query("SELECT SUM(e.employeeSalary) FROM Employee e")
    public float sumEmployeeSalaries();
}
