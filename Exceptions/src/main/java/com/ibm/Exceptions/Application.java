package com.ibm.Exceptions;

import java.util.Scanner;

public class Application {
          public static void main(String[] args) {
			System.out.println("Start");
			Scanner s=new Scanner(System.in);
			String firstParam=null;
			String secondParam=null;
			try {
				firstParam=args[0];
				secondParam=args[1];
				try {
					System.out.println(Integer.parseInt(firstParam)/(Integer.parseInt(secondParam)));
					
				}catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("end of the nested try");
				}
				finally {System.out.println("end of the outer try");}
			} 
			catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
				System.out.println("Run the program supplying a number");
			}
			catch (ArithmeticException e) {
				System.out.println("You cannot divide by zero");
			}catch(Exception e) {
				System.out.println("Unknown error");
			}

			System.out.println("End");
		}
}
