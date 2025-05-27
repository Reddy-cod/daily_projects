package com.ibm.springmvcjpa1.service;

import java.util.List;

import com.ibm.springmvcjpa1.entity.Department;

public interface DepartmentService {
List<Department> getAllDepartments();
	
	Department getDepartmentById(Long id);
	
	Department saveDepartment(Department department);
	
	void deleteDepartment(Long id);
	
	Department updateDepartment(Long id, Department department);
}
