package com.ibm.springmvcjpa1.service;

import com.ibm.springmvcjpa1.entity.Department;

@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public List<Department> getAllDepartments() {
		// TODO Auto-generated method stub
		return departmentRepository.findAll();
	}

	@Override
	public Department getDepartmentById(Long id) {
		// TODO Auto-generated method stub
		return departmentRepository.findById(id).orElseThrow(()-> new RuntimeException("Department not found with id:" + id));
	}

	@Override
	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentRepository.save(department);
	}

	@Override
	public void deleteDepartment(Long id) {
		// TODO Auto-generated method stub
		departmentRepository.deleteById(id);
		
	}

	@Override
	public Department updateDepartment(Long id, Department department) {
		// TODO Auto-generated method stub
		Department existingDepartment = getDepartmentById(id);
		existingDepartment.setName(department.getName());
		return departmentRepository.save(existingDepartment);
	}

	@Override
	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Department updateDepartment(Long id, Department department) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
