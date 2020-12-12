package com.java.oop2_1;

import com.java.oop2.MyParent;

class MyChild extends MyParent{
	public void printMembers() {
		//System.out.println(prv); //ERROR(같은 클래스 내에서만 사용가능)
		//System.out.println(dft); //ERROR(같은 패키지 내에서만 사용가능)
		System.out.println(prt); //OK
		System.out.println(pub); //OK
	}
}

public class MyParentTest2 {

	public static void main(String[] args) {
		MyParent p = new MyParent();
		//System.out.println(p.prv); //ERROR(같은 클래스 내에서만 사용가능)
		//System.out.println(p.dft); //ERROR(같은 패키지 내에서만 사용가능)
		//System.out.println(p.prt); 	 //ERROR(같은 패키지 혹은 다른 패키지 자손에서만 사용가능)
		System.out.println(p.pub); //OK

	}

}
