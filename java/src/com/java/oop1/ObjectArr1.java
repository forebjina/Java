package com.java.oop1;

public class ObjectArr1 {

	public static void main(String[] args) {
		
		//���̰� 3�� TvŸ���� ���������迭 ����
		Tv[] tvArr = new Tv[3];
		
		for(int i=0; i<tvArr.length; i++) {
			tvArr[i] = new Tv();//tvArr���������迭�� �� ��Ҹ��� ��ü������ ����
			tvArr[i].channel = i+10;//tvArr[i]�� channel�� i+10�� ����
		}

		for(int i=0; i<tvArr.length; i++) {
			tvArr[i].channelUp();
			System.out.println("tvArr["+i+"].channel="+tvArr[i].channel);
		}
	}

}

class Tv {
	String color; //����
	boolean power; //��������(on/off)
	int channel; //ä��
	
	void power() {power = !power;}
	void channelUp() {++channel;}
	void chaanelDown() {--channel;}
}