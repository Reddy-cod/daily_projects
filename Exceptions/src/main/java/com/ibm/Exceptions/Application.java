package com.ibm.Exceptions;

public class Application {
          public static void main(String[] args) {
			System.out.println("Start");
			try {
				System.out.println(args[0]);
			} 
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Run the program supplying a number");
			}
			catch (ArithmeticException e) {
				System.out.println("You cannot divide by zero");
			}
			catch (NumberFormatException  e) {
				System.out.println("Provide valid numbers");
			}catch(Exception e) {
				System.out.println("Unknown error");
			}

			System.out.println("End");
		}
}
