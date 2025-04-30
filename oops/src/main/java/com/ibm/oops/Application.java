package com.ibm.oops;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HR hr=new HR();
       Employee employee =hr.recruit("i"); //Upcasting
       employee.salary();
       employee =hr.recruit("c"); //Upcasting
       employee.salary();
	}

}
