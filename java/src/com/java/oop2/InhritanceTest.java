package com.java.oop2;

//class MyPoint {
class MyPoint extends Object{ //��������� �θ� Ŭ������ ��ӹ��� ������ ObjectŬ������ ���(ObjectŬ������ ��� Ŭ������ �ְ� ����)
	int x;
	int y;
}

class MyCircle1 extends MyPoint{ //���
	int r;
}

class MyCircle2 extends MyPoint{ //����
	MyPoint c = new MyPoint();
	int r;
}


public class InhritanceTest {

	public static void main(String[] args) {
		
		MyCircle1 c = new MyCircle1();
		//CircleŬ������ toString()�̶�� �޼��尡 ���µ��� ObjectŬ������ ���ǵ� �޼����̱⿡ ȣ�� ����
		System.out.println(c.toString()); //com.java.oop2.Circle@7852e922
		System.out.println(c); //com.java.oop2.Circle@7852e922
		// ���� �� ������ ����
		//'println'�޼��� ��ü�� ���������� ������ �ڵ����� ��������.toSting()�޼��带 ȣ��
	}

}
