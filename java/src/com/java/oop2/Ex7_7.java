package com.java.oop2;

class Car{
	String color;
	int door;
	public void drive() {
		System.out.println("drive!!!!!!!!!!!!!!!!!!!");
	}
	public void stop() {
		System.out.println("stop!!!!!!!!!!!!!!!!!!!!");
	}
}

class FireEngine extends Car{
	public void water() {
		System.out.println("water!!!!!!!!!!!!!!!!!!!");
	}
}

public class Ex7_7 {

	public static void main(String[] args) {
		Car c =  new Car();
		FireEngine f = (FireEngine)c; //형변환 실행 에러 java.lang.ClassCastException
		f.water(); //컴파일은 OK
		
		
		Car c2 = null;
		FireEngine f2 = null; //실제 인스턴스가 무엇인지가 중요
		f2 = (FireEngine)c2;
		c2 = (Car)f2;
		c2.drive(); //NullPointerException발생.
		
		
		
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe; //car = (Car)fe;
		//car.water(); //컴파일 에러. Car타입의 참조변수로는 water()를 호출할 수 없음
		fe2 = (FireEngine)car;
		fe2.water();
	}

}
