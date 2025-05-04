package com.ibm.oops;

 class Intern extends Employee {
    @Override
    public int netPay() {
    	// TODO Auto-generated method stub
    	System.out.println("stipend");
    	return 0;
    }
}
 class HR {
	    public Employee recruit(String empType) {
	    	 if(empType.equalsIgnoreCase("i")) {
	    		 Intern intern =new Intern();
	    		 return intern;
	    	 }
	    	 else if(empType.equalsIgnoreCase("C")) {
	    		 return new Confirmed();
	    	 }else if(empType.equalsIgnoreCase("f")) {
	    		 return new Freelance();
	    	 }
	    	 return null;
	    }
	    
	}
 class Confirmed extends Employee {

		@Override
		public int netPay() {
			// TODO Auto-generated method stub
			System.out.println("Employee confirmed");
			return 0;
		}
		public void transportation() {
			System.out.println("permanent employee Transportation");
			
		}

	}
 class Freelance extends Employee {

		@Override
		public int netPay() {
			// TODO Auto-generated method stub
			System.out.println("Freelance pay");
			return 0;
		}

	}
 class Financial {
	    public void processSalary(Employee employee) {
	    	employee.netPay();
	    	if(employee instanceof Confirmed) {
	    		Confirmed confirm= (Confirmed)employee;
	    		confirm.transportation();
	    	}
	    }
	}
 abstract class Employee {
     public abstract int netPay();
}
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
