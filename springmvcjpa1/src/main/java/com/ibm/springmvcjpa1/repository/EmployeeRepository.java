package com.ibm.springmvcjpa1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.springmvcjpa1.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
	List<Employee> findByDepartmentId(Long departmentId);
}
