package com.ibm.Exceptions;

import java.util.Scanner;

public class Application {
          public static void main(String[] args) {
			System.out.println("Start");
			Scanner s=new Scanner(System.in);
			try {
				System.out.println(args[0]);
				int a =s.nextInt();
				int b=s.nextInt();
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
