package com.java.oop2_1;

import com.java.oop2.MyParent;

class MyChild extends MyParent{
	public void printMembers() {
		//System.out.println(prv); //ERROR(���� Ŭ���� �������� ��밡��)
		//System.out.println(dft); //ERROR(���� ��Ű�� �������� ��밡��)
		System.out.println(prt); //OK
		System.out.println(pub); //OK
	}
}

public class MyParentTest2 {

	public static void main(String[] args) {
		MyParent p = new MyParent();
		//System.out.println(p.prv); //ERROR(���� Ŭ���� �������� ��밡��)
		//System.out.println(p.dft); //ERROR(���� ��Ű�� �������� ��밡��)
		//System.out.println(p.prt); 	 //ERROR(���� ��Ű�� Ȥ�� �ٸ� ��Ű�� �ڼտ����� ��밡��)
		System.out.println(p.pub); //OK

	}

}
