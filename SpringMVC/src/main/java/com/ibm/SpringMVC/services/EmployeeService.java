package com.ibm.SpringMVC.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ibm.SpringMVC.repositories.EmployeeRepository;
import com.ibm.SpringMVC.entities.Employee;

@Service
public class EmployeeService {
      
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	public List<Employee> getAllEmployees(){
		return employeeRepository.findAll();
	}
}
