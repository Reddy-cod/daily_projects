package com.ibm.interfaces;

interface Printer {
	public void print();
}
class HPprinter implements Printer{

	@Override
	public void print() {
		System.out.println("HPprinter printing ");
		
	}
	
}
class Process {
	public void execute(Printer printer) {
		printer.print();
	}
}
public class Application {
    public static void main(String args[]) {
    	Process process =new Process();
    	process.execute(new HPprinter());
    }
}
