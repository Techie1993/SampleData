package com.jtc.interview;


interface Flyable{
	void fly();
}


class Sparrow implements Flyable{

	@Override
	public void fly() {
		System.out.println("Sparrow is flying");
	}	
}


class Penguin implements Flyable{

	@Override
	public void fly() {
		System.out.println("Penguin is Flying");	
	}	
}

public class Liskov {

	public static void main(String[] args) {
		Sparrow spa=new Sparrow();
		spa.fly();
		
		Penguin pen=new Penguin();
		pen.fly();

	}
}
