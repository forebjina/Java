package com.java.oop1;

//������ ��ȯŸ��
public class ReferenceReturn {

	public static void main(String[] args) {
		Data3 d = new Data3();
		d.x = 10;
		
		Data3 d2 = copy(d);
		System.out.println("(1)d.x = " + d.x);	 //10
		System.out.println("(1)d2.x = " + d2.x); //10
		
		d2.x = 30;
		System.out.println("(2)d.x = " + d.x);   //10
		System.out.println("(2)d2.x = " + d2.x); //30
	}
	
	static Data3 copy(Data3 d) {
		Data3 tmp = new Data3();	//���ο� ��ü tmp�� ����
		tmp.x = d.x;				//d.x�� ���� tmp.x�� ����
		return tmp;					//������ ��ü�� �ּҸ� ��ȯ
	}
}

class Data3 {int x;}