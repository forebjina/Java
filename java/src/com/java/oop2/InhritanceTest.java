package com.java.oop2;

//class MyPoint {
class MyPoint extends Object{ //명시적으로 부모 클래스를 상속받지 않으면 Object클래스를 상속(Object클래스는 모든 클래스의 최고 조상)
	int x;
	int y;
}

class MyCircle1 extends MyPoint{ //상속
	int r;
}

class MyCircle2 extends MyPoint{ //포함
	MyPoint c = new MyPoint();
	int r;
}


public class InhritanceTest {

	public static void main(String[] args) {
		
		MyCircle1 c = new MyCircle1();
		//Circle클래스에 toString()이라는 메서드가 없는데도 Object클래스에 정의된 메서드이기에 호출 가능
		System.out.println(c.toString()); //com.java.oop2.Circle@7852e922
		System.out.println(c); //com.java.oop2.Circle@7852e922
		// 위의 두 문장이 같음
		//'println'메서드 자체가 참조변수가 들어오면 자동으로 참조변수.toSting()메서드를 호출
	}

}
