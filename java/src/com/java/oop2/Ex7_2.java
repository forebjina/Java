package com.java.oop2;

class Point1{
	int x = 1;
	int y = 2;
	
}

class Circle1 {
	Point1 c = new Point1();
	int r = 3;

}

class Circle2 extends Point1{
	//Point c = new Point();
	int r = 4;

}

public class Ex7_2 {
	public static void main(String[] args) {
		
		Circle1 c1 = new Circle1();
		System.out.println(c1.c.x);
		System.out.println(c1.r);
		
		Circle2 c2 = new Circle2();
		//System.out.println(c2.c.x);
		System.out.println(c2.y);
		System.out.println(c2.r);
		
	}
}
