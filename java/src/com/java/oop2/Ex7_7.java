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
		FireEngine f = (FireEngine)c; //����ȯ ���� ���� java.lang.ClassCastException
		f.water(); //�������� OK
		
		
		Car c2 = null;
		FireEngine f2 = null; //���� �ν��Ͻ��� ���������� �߿�
		f2 = (FireEngine)c2;
		c2 = (Car)f2;
		c2.drive(); //NullPointerException�߻�.
		
		
		
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe; //car = (Car)fe;
		//car.water(); //������ ����. CarŸ���� ���������δ� water()�� ȣ���� �� ����
		fe2 = (FireEngine)car;
		fe2.water();
	}

}
