package com.java.oop2;

class Time{
	private int hour;	//0~23사이의 값을 가져야함
	private int minute;
	private int second;
	
	public void setHour(int hour) {
		if(isNotValidate(hour)) return;
		this.hour = hour;
	}

	//매개변수로 넘겨진 hour가 유효한지 화인해서 알려주는 메서드
	//좀 더 명시적인 메서드기능을 정의하기 위해서 같은 클래스내에서만 사용하는 메서드이므로 접근제어자를 'private'으로 함
	//접근제어자를 'private'으로 해 놓으면 해당 메서드를 수정했을 때 어차피 자신의 클래스 내에서만 사용하는 메서드라는게 명시적이므로 테스트 하기가 수월함(효율적)
	//따라서 접근제어자의 범위는 좁혀 놓고 필요에 의해 넓혀 나가는 것이 좋음
	private boolean isNotValidate(int hour) {
		return hour < 0 || hour > 23;
	}

	public int getHour() {return hour;}
}

public class TimeTest {

	public static void main(String[] args) {
		Time t = new Time();
		//t.hour = -100; //ERROR('private'으로 선언된 변수이므로 직접 접근 할 수 없고 메서드로 값을 변경할 수 있음)
		t.setHour(21); //hour의 값을 메서드를 이용하여 21로 변경
		System.out.println(t.getHour());
		t.setHour(100);
	}

}
