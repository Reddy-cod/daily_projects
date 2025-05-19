package com.ibm.springmvcjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.springmvcjpa.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    Department findByName(String name);
}
