package com.example.employment.service;

import com.example.employment.model.Employee;
import com.example.employment.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee addEmployee(Employee employee) throws Exception {
        if (employee.getFirstName() == null || employee.getLastName() == null ||
                employee.getBirthDate() == null || employee.getPosition() == null) {
            throw new Exception("Missing required fields");
        }
        if (employee.getBirthDate().isAfter(LocalDate.now())) {
            throw new Exception("Birth date cannot be in the future");
        }
        if (employeeRepository.existsByFirstNameAndMiddleNameAndLastNameAndBirthDate(
                employee.getFirstName(), employee.getMiddleName(), employee.getLastName(), employee.getBirthDate())) {
            throw new Exception("Employee already exists");
        }
        employee.setUid(java.util.UUID.randomUUID().toString());
        return employeeRepository.save(employee);
    }

    public List<Employee> searchEmployees(String first, String last, String position) {
        return employeeRepository.findByFirstNameContainingIgnoreCaseAndLastNameContainingIgnoreCaseAndPositionContainingIgnoreCase(
                first == null ? "" : first, last == null ? "" : last, position == null ? "" : position);
    }

    public Optional<Employee> getEmployeeById(String uid) {
        return employeeRepository.findById(uid);
    }

    public Employee updateEmployee(Employee employee) throws Exception {
        if (employee.getFirstName() == null || employee.getLastName() == null ||
                employee.getBirthDate() == null || employee.getPosition() == null) {
            throw new Exception("Missing required fields");
        }
        if (employee.getBirthDate().isAfter(LocalDate.now())) {
            throw new Exception("Birth date cannot be in the future");
        }
        List<Employee> others = employeeRepository.findByFirstNameContainingIgnoreCaseAndLastNameContainingIgnoreCaseAndPositionContainingIgnoreCase(
                employee.getFirstName(), employee.getLastName(), employee.getPosition());
        for (Employee other : others) {
            if (!other.getUid().equals(employee.getUid()) && other.equals(employee)) {
                throw new Exception("Another employee with identical info exists");
            }
        }
        return employeeRepository.save(employee);
    }
}