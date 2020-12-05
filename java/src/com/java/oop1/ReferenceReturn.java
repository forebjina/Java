package com.java.oop1;

//참조형 반환타입
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
		Data3 tmp = new Data3();	//새로운 객체 tmp를 생성
		tmp.x = d.x;				//d.x의 값을 tmp.x에 복사
		return tmp;					//복사한 객체의 주소를 반환
	}
}

class Data3 {int x;}