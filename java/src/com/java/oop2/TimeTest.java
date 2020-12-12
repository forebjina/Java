package com.java.oop2;

class Time{
	private int hour;	//0~23������ ���� ��������
	private int minute;
	private int second;
	
	public void setHour(int hour) {
		if(isNotValidate(hour)) return;
		this.hour = hour;
	}

	//�Ű������� �Ѱ��� hour�� ��ȿ���� ȭ���ؼ� �˷��ִ� �޼���
	//�� �� ������� �޼������� �����ϱ� ���ؼ� ���� Ŭ������������ ����ϴ� �޼����̹Ƿ� ���������ڸ� 'private'���� ��
	//���������ڸ� 'private'���� �� ������ �ش� �޼��带 �������� �� ������ �ڽ��� Ŭ���� �������� ����ϴ� �޼����°� ������̹Ƿ� �׽�Ʈ �ϱⰡ ������(ȿ����)
	//���� ������������ ������ ���� ���� �ʿ信 ���� ���� ������ ���� ����
	private boolean isNotValidate(int hour) {
		return hour < 0 || hour > 23;
	}

	public int getHour() {return hour;}
}

public class TimeTest {

	public static void main(String[] args) {
		Time t = new Time();
		//t.hour = -100; //ERROR('private'���� ����� �����̹Ƿ� ���� ���� �� �� ���� �޼���� ���� ������ �� ����)
		t.setHour(21); //hour�� ���� �޼��带 �̿��Ͽ� 21�� ����
		System.out.println(t.getHour());
		t.setHour(100);
	}

}
