package com.ibm.SpringJdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application
{
	public static void main( String[] args )
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("springjdbc.xml");
		EmployeeJDBCTemplate employeeJDBCTemplate=(EmployeeJDBCTemplate)context.getBean("employeeJDBCTemplateBean");
		
		//System.out.println("------Records fetched");
		//employeeJDBCTemplate.create("mohith", "mohithe", 98999);
		
//		System.out.println("Listing  multiple records");
//		List<Employee> employees=employeeJDBCTemplate.listEmployees();
//		for(Employee employee:employees) {
//			System.out.print("ID :"+employee.getId());
//			System.out.print(", First Name :"+employee.getFirstName());
//			System.out.print(", Last Name:"+employee.getLastName());
//			System.out.print(", Salary :"+employee.getSalary());
//			System.out.println();
//		}
		
//		System.out.println("Listing  record");
//		Employee employees=employeeJDBCTemplate.getEmployee(3);
//			System.out.print("ID :"+employees.getId());
//			System.out.print(", First Name :"+employees.getFirstName());
//			System.out.print(", Last Name:"+employees.getLastName());
//			System.out.print(", Salary :"+employees.getSalary());
//			System.out.println();
//		
////	}
//		// Update an employee's details
//		System.out.println("Updating Record with ID = 3");
//		employeeJDBCTemplate.update(3, "UpdatedFirst", "UpdatedLast");

//		// Delete an employee
//		System.out.println("Deleting Record with ID = 4");
//		employeeJDBCTemplate.delete(4);
	}
}