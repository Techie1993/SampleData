package com.jtc.factory;


interface Vehicle2{
	void drive();
}

class Truck implements Vehicle2{

	@Override
	public void drive() {
		System.out.println("Truck is started");
		
	}
	
}


class Tractor implements Vehicle2{

	@Override
	public void drive() {
		System.out.println("Tractor is Started!");
		
	}
}

public class ExampleFactory {

	public static void main(String[] args) {
		
		Truck T1=new Truck();
		T1.drive();
		
		Tractor trac=new Tractor();
		trac.drive();
		
	}
}
