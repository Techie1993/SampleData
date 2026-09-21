package com.jtc.practice;



interface Bus{
	default void start() {
		System.out.println("Bus is Started!");
	}
	
	default void stop() {
		System.out.println("***");
	}
}


class Car implements Bus{
	
	public void start() {
		System.out.println("Car is Started!");
	}
	
	public void stop() {
		System.out.println("***");
	}
	
}

public class DefaultExample {

	public static void main(String[] args) {
		
		Car c1=new Car();
		c1.start();
		
	}
}
