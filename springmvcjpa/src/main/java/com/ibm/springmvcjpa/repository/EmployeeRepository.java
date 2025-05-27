package com.ibm.springmvcjpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.springmvcjpa.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByDepartmentId(Long departmentId);
}