package com.java.oop1;

//예제6-26 298p
class Car3{
	String color; //색상
	String gearType; //변속기 종류 - auto(자동), manual(수동)
	int door; //문
	
	Car3(){
		this("white", "auto", 4);
	}
	
	Car3(Car3 c){
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}
	
	Car3(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}

public class CarTest3 {

	public static void main(String[] args) {
		
		Car3 c = new Car3();
		Car3 c2  = new Car3("blue", "manual", 2);
		Car3 c3 = new Car3(c2);

		System.out.println("c의 color는 " + c.color + " c의 gearType은 "+ c.gearType + " c의 door는 "+ c.door + "입니다.");
		System.out.println("c2의 color는 " + c2.color + " c2의 gearType은 "+ c2.gearType + " c2의 door는 "+ c2.door + "입니다.");
		System.out.println("c3의 color는 " + c3.color + " c3의 gearType은 "+ c3.gearType + " c3의 door는 "+ c3.door + "입니다.");
	}

}
