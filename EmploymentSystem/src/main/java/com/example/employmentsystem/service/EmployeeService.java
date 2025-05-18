package com.example.employmentsystem.service;

import com.example.employmentsystem.entity.Employee;
import com.example.employmentsystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee addEmployee(Employee employee) {
        if (employeeRepository.existsByFirstNameAndMiddleNameAndLastNameAndBirthDate(
                employee.getFirstName(), employee.getMiddleName(), employee.getLastName(), employee.getBirthDate())) {
            throw new IllegalArgumentException("Employee already exists");
        }
        return employeeRepository.save(employee);
    }

    public List<Employee> searchEmployees(String firstName, String lastName, String position) {
        return employeeRepository.findByFirstNameContainingIgnoreCaseAndLastNameContainingIgnoreCaseAndPositionContainingIgnoreCase(
                firstName == null ? "" : firstName,
                lastName == null ? "" : lastName,
                position == null ? "" : position
        );
    }

    public Optional<Employee> getEmployee(Long uid) {
        return employeeRepository.findById(uid);
    }

    public Employee updateEmployee(Employee existing, Employee updated) {
        existing.setFirstName(updated.getFirstName());
        existing.setMiddleName(updated.getMiddleName());
        existing.setLastName(updated.getLastName());
        existing.setBirthDate(updated.getBirthDate());
        existing.setPosition(updated.getPosition());
        return employeeRepository.save(existing);
    }
}