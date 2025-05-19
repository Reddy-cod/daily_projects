package com.ibm.springmvcjpa.service;

import java.util.List;

import com.ibm.springmvcjpa.entities.Employee;

public interface EmployeeService {
  List<Employee> getAllEmployees();
   Employee getEmployeeById(Long id );
   Employee saveEmployee(Employee employee);
   void deleteEmployee(Long id );
   Employee updateEmployee(Long id,Employee employee);
   List<Employee>getEmployeesByDepartmentId(Long departmentId);
}
