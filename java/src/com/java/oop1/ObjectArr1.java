package com.java.oop1;

public class ObjectArr1 {

	public static void main(String[] args) {
		
		//길이가 3인 Tv타입의 참조변수배열 선언
		Tv[] tvArr = new Tv[3];
		
		for(int i=0; i<tvArr.length; i++) {
			tvArr[i] = new Tv();//tvArr참조변수배열의 각 요소마다 객체생성후 대입
			tvArr[i].channel = i+10;//tvArr[i]의 channel에 i+10을 저장
		}

		for(int i=0; i<tvArr.length; i++) {
			tvArr[i].channelUp();
			System.out.println("tvArr["+i+"].channel="+tvArr[i].channel);
		}
	}

}

class Tv {
	String color; //색상
	boolean power; //전원상태(on/off)
	int channel; //채널
	
	void power() {power = !power;}
	void channelUp() {++channel;}
	void chaanelDown() {--channel;}
}