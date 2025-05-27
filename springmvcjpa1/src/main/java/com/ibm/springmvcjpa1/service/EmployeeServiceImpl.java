package com.ibm.springmvcjpa1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.springmvcjpa1.entity.Department;
import com.ibm.springmvcjpa1.entity.Employee;
import com.ibm.springmvcjpa1.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private DepartmentService departmentService;

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(Long id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Employee not found with id:"+ id));
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		if(employee.getDepartment() != null && employee.getDepartment() != null) {
			Department department = departmentService.getDepartmentById(employee.getDepartment().getId());
			employee.setDepartment(department);
		}
		return employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployee(Long id) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(id);
		
	}

	@Override
	public Employee updateEmployee(Long id, Employee employee) {
		// TODO Auto-generated method stub
		Employee existingEmployee = getEmployeeById(id);
		existingEmployee.setName(employee.getName());
		
		if(employee.getDepartment() != null && employee.getDepartment().getId() != null) {
			Department department = departmentService.getDepartmentById(employee.getDepartment().getId());
			existingEmployee.setDepartment(department);
		}
		
		return employeeRepository.save(existingEmployee);
	}

	@Override
	public List<Employee> getEmployeesByDepartmentId(Long departmentId) {
		// TODO Auto-generated method stub
		return employeeRepository.findByDepartmentId(departmentId);
	}
	
	
}
