package com.jtc.practice;


interface Truck{
	public static void run() {
		System.out.println("Truck is running");
	}
}


class Person implements Truck{
	
}

public class StaticMethods {

	public static void main(String[] args) {
		
		Person P1=new Person();
		Truck.run();
		
		
	}
}
