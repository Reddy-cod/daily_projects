package com.ibm.AssertException;

class Arithmetic {
	public int sum(int a ,int b) {
		return a*b;
	}
}
public class Application {
public static void main(String args[]) {
	System.out.println("Start");
	Arithmetic arithmetic=new Arithmetic();
	assert(arithmetic.sum(2,4 )==6):"The sum method in defective";
	System.out.println("End");
}
}
