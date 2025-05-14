package com.ibm.SpringJdbc;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeJDBCTemplate implements EmployeeDAO {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	
	
	
	@Override
	public void setDataSource(DataSource dataSource) {
		// TODO Auto-generated method stub
		this.dataSource=dataSource;
		this.jdbcTemplateObject =new JdbcTemplate(dataSource);

	}

	@Override
	public void create(String firstName, String lastName, Integer salary) {
		// TODO Auto-generated method stub
		String  SQL="insert into Employee (firstname,lastname,salary) values(?,?,?)";
		jdbcTemplateObject.update(SQL,firstName,lastName,salary);
		System.out.println("Created Record Name = "+firstName+"Salary = "+salary);

	}

	@Override
	public Employee getEmployee(Integer id) {
		// TODO Auto-generated method stub
		String SQL="select * from Employee where id= ?";
		Employee employee=jdbcTemplateObject.queryForObject(SQL,new Object[]{id},new EmployeeMapper());
		return employee;
	}

	@Override
	public List<Employee> listEmployees() {
		// TODO Auto-generated method stub
		  String SQL="select * from Employee";
		  List<Employee>employees=jdbcTemplateObject.query(SQL, new EmployeeMapper());
		return employees;
	}

	@Override
	public void delete(Integer id) {
	    String SQL = "delete from Employee where id = ?";
	    jdbcTemplateObject.update(SQL, id);
	    System.out.println("Deleted Record with ID = " + id);
	}

	@Override
	public void update(Integer id, String firstName, String lastName) {
	    String SQL = "update Employee set firstname = ?, lastname = ? where id = ?";
	    jdbcTemplateObject.update(SQL, firstName, lastName, id);
	    System.out.println("Updated Record with ID = " + id);
	}

}
