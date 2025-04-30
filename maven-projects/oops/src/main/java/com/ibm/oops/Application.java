package com.ibm.oops;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HR hr=new HR();
		Financial financial=new Financial();
		
       Employee employee =hr.recruit("i"); //Upcasting
       if(employee!=null)
       financial.processSalary(employee);
       employee =hr.recruit("c"); //Upcasting
       if(employee!=null)
       financial.processSalary(employee);
       employee =hr.recruit("f"); //Upcasting
       if(employee!=null)
       financial.processSalary(employee);
	}

}
