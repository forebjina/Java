package com.java.oop1;

//예제6-25 296p
class Car {
	String color; //색상
	String gearType; //변속기 종류 - auto(자동), manual(수동)
	int door;	//문의 개수
	
	Car(){
		this("white","auto",4);//Car(String color, String gearType, int door) 호출
	}
	
	Car(String color){
		this(color, "auto", 4); //Car(String color, String gearType, int door) 호출 
	}
	
	Car(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}

public class CarTest2 {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("blue");
		
		System.out.println("c1의 color는 " + c1.color + " c1의 gearType은 " + c1.gearType + " c1의 door는 " + c1.door + " 입니다.");
		System.out.println("c2의 color는 " + c2.color + " c2의 gearType은 " + c2.gearType + " c2의 door는 " + c2.door + " 입니다.");		
	}
}
