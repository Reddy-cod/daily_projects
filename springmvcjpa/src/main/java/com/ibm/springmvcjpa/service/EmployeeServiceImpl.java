package com.ibm.springmvcjpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.springmvcjpa.entities.Department;
import com.ibm.springmvcjpa.entities.Employee;
import com.ibm.springmvcjpa.repository.DepartmentRepository;
import com.ibm.springmvcjpa.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        if (employee.getDepartment() != null) {
            Department department = departmentRepository.findById(employee.getDepartment().getId())
                .orElseThrow(() -> new RuntimeException("Department not found with id: " + employee.getDepartment().getId()));
            employee.setDepartment(department);
        }
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public Employee updateEmployee(Long id, Employee employee) {
        Employee existingEmployee = getEmployeeById(id);
        existingEmployee.setName(employee.getName());

        if (employee.getDepartment() != null) {
            Department department = departmentRepository.findById(employee.getDepartment().getId())
                .orElseThrow(() -> new RuntimeException("Department not found with id: " + employee.getDepartment().getId()));
            existingEmployee.setDepartment(department);
        }

        return employeeRepository.save(existingEmployee);
    }

}
