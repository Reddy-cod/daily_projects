package com.ibm.project;

class Point {
	public int x;
	public int y;
}
public class NonPrimitiveArrays {
 public static void main(String args[]) {
	 Point points[];
	 points=new Point[3];
	 points[0]=new Point();
	 points[0].x=3;
	 System.out.println(points[0].x);
 }
}
