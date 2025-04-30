package com.ibm.project;
class Block {
	public static int value;
	
	{
		System.out.println("inline block");
	}
	
	static {
		value=10;
		System.out.println("static initializer");
		
	}
	public Block() {
		System.out.println("Constructor");
	}
}
public class PrintingOrder {
    public static void main(String args[]) {
    	Block block =new Block();
    }
}
