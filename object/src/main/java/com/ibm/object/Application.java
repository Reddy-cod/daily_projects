package com.ibm.object;



 class Point{
	  int x,y;
	  Point(){
		  System.out.println("no parameterized constructor");
	  }
	  Point (int x,int y){
		  this.x=x;
		  this.y=y;
	  }
	  @Override
	public boolean equals(Object obj) {
		if(obj instanceof Point) {
			Point point=(Point)obj;
			if(this.x==point.x&&this.y==point.y) {
				return true;
			}
		}
		return false;
	}
	  @Override
	public String toString() {
		
		return x+","+y;
	}
 }
public class Application {
  public static void main(String[] args) {
	Point point1=new Point(2,4);
	Point point2=new Point(2,4);
	System.out.println(point1.equals(point2));
	System.out.println(point1);
}
}
