package com.java.oop2;

//���� 7-1
class Tv{
	boolean power; //��������(on/off)
	int channel;   //ä��
	
	void power() 		{power = !power; }
	void channelUp() 	{++channel;}
	void channelDown()	{--channel;}
	
}

class CaptionTv extends Tv{
	boolean caption;	//ĸ�ǻ���(on/off)
	void displayCaption(String text) {
		if(caption) {	//ĸ�ǻ��װ� on(true)�� ���� text�� ������
			System.out.println(text);
		}
	}
}
public class Ex7_1 {
	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello, World");
		ctv.caption = true;
		ctv.displayCaption("Hello World");
	}
}
