package com.ibm.oops;

public class HR {
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
