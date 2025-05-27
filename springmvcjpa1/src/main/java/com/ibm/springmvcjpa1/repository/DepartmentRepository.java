package com.ibm.springmvcjpa1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.springmvcjpa1.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
	Department findByName(String name);
}
