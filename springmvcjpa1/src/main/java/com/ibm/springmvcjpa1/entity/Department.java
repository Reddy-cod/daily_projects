package com.ibm.springmvcjpa1.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "department")
public class Department {

		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY) // Optional if you want auto-increment
	    private Long id;

	    @Column(name = "dept_name", nullable = false, length = 100)
	    private String name;
	    
	    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
	    private List<Employee> employees = new ArrayList<>();
	    
	    public List<Employee> getEmployees() {
	        return employees;
	    }

	    public void setEmployees(List<Employee> employees) {
	        this.employees = employees;
	    }

	    public Department() {
	    	
	    }
	    
		public Department(String name) {
			this.name = name;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		 // Helper method to add an employee
	    public void addEmployee(Employee employee) {
	        employees.add(employee);
	        employee.setDepartment(this);
	    }

	    // Helper method to remove an employee
	    public void removeEmployee(Employee employee) {
	        employees.remove(employee);
	        employee.setDepartment(null);
	    }
	   
	
}
