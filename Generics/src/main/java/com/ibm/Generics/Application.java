package com.ibm.Generics;

class Point<T> {
	private int x;
	private int y;
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return x+","+y;
	}
	
}

public class Application
{
	public static void main( String[] args )
	{
		Point<Float> point=new Point<Float>(2,4);
		String string=point.toString();
		System.out.println(string);
		System.out.println(point.getX() +" "+point.getY());
		
	}
}