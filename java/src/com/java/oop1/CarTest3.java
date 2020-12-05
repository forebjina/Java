package com.java.oop1;

//����6-26 298p
class Car3{
	String color; //����
	String gearType; //���ӱ� ���� - auto(�ڵ�), manual(����)
	int door; //��
	
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

		System.out.println("c�� color�� " + c.color + " c�� gearType�� "+ c.gearType + " c�� door�� "+ c.door + "�Դϴ�.");
		System.out.println("c2�� color�� " + c2.color + " c2�� gearType�� "+ c2.gearType + " c2�� door�� "+ c2.door + "�Դϴ�.");
		System.out.println("c3�� color�� " + c3.color + " c3�� gearType�� "+ c3.gearType + " c3�� door�� "+ c3.door + "�Դϴ�.");
	}

}
