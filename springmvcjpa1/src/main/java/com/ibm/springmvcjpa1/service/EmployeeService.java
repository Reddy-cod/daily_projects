package com.ibm.springmvcjpa1.service;

import java.util.List;

import com.ibm.springmvcjpa1.entity.Employee;

public interface EmployeeService {
List<Employee> getAllEmployees();
	
	Employee getEmployeeById(Long id);
	
	Employee saveEmployee(Employee employee);
	
	void deleteEmployee(Long id);
	
	Employee updateEmployee(Long id, Employee employee);
	
	List<Employee> getEmployeesByDepartmentId(Long departmentId);
}
