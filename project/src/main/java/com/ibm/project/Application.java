package com.ibm.project;

public class Application {
public static void main(String args[]) {
	int nums[][];
	nums=new int [2][5];
	for(int []array:nums) {
		for(int value:array) {
			System.out.println(value);
		}
	}
}
}
