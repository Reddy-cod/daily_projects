package com.ibm.oops;

public class Financial {
    public void processSalary(Employee employee) {
    	employee.netPay();
    	if(employee instanceof Confirmed) {
    		Confirmed confirm= (Confirmed)employee;
    		confirm.transportation();
    	}
    }
}
