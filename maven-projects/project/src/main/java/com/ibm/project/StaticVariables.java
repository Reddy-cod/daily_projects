package com.ibm.project;

class Data{
	public static int value;
}
public class StaticVariables {
  public static void main(String args[]) {
	  Data data1=new Data();
	  Data data2=new Data();
	  
	  data1.value=2;
	  data2.value=3;
	  Data.value=55;
	  System.out.println(data1.value);
	  System.out.println(data2.value);
	  System.out.println(Data.value);

  }
}
