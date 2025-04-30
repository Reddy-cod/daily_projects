package com.ibm.april30;

enum Apple {
	RedDel(10),
	Gala(9),
	Green(8);
	private int price;
	Apple (int value) {
		price=value;
	}
	public int getPrice() {
		return price;
	}
	
}
public class enumerated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Apple apple=Apple.RedDel;
         System.out.println(apple);
         apple=Apple.valueOf("Gala");
         System.out.println(apple);
         Apple []apples=Apple.values();
         for(Apple applex:apples) {
        	 System.out.println(applex);
         }
         for(Apple applex:apples) {
        	 System.out.println(applex.getPrice());
         }

	}

}
