package com.java.oop1;

//예제6-5. 248p
public class CardTest {

	public static void main(String[] args) {
		
		System.out.println("Card.width="+Card.width);
		System.out.println("Card.height="+Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1의 kind는 "+c1.kind+", number는 " +c1.number+", width는 "+c1.width+", height는 "+c1.height+"입니다.");
		System.out.println("c2의 kind는 "+c2.kind+", number는 " +c2.number+", width는 "+c2.width+", height는 "+c2.height+"입니다.");
		
		c1.width = 50;
		c1.height = 80;
		
		System.out.println("c1의 kind는 "+c1.kind+", number는 " +c1.number+", width는 "+c1.width+", height는 "+c1.height+"입니다.");
		System.out.println("c2의 kind는 "+c2.kind+", number는 " +c2.number+", width는 "+c2.width+", height는 "+c2.height+"입니다.");

	}

}

class Card{
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
}
