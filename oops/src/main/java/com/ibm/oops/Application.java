package com.ibm.oops;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Employee employee =new Intern(); //Upcasting
       employee.salary();
       employee =new Confirmed(); //Upcasting
       employee.salary();
	}

}
