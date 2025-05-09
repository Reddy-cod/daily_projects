package com.ibm.Internationalization;

import java.text.NumberFormat;
import java.util.Locale;

public class Application {
  public static void main(String[] args) {
	  double d=123456.789;
	NumberFormat nf=NumberFormat.getInstance(Locale.ITALY);
	NumberFormat nf1=NumberFormat.getInstance(Locale.US);
	NumberFormat nf2=NumberFormat.getInstance(Locale.CHINA);
	System.out.println("ITALY representation of "+d+" : "+nf.format(4));
	System.out.println("ITALY representation of "+d+" : "+nf1.format(4));
	System.out.println("ITALY representation of "+d+" : "+nf2.format(4));
	System.out.println(Locale.US);
}
}
