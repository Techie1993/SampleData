package com.jtc.factory;


interface Vehicle{
	
	void Start();
}



class Car implements Vehicle{

	@Override
	public void Start() {
		System.out.println("Car is Started!");	
	}
}


class Bike implements Vehicle{

	@Override
	public void Start() {
		System.out.println("Bike started!");
	}	
}

public class FactoryDesign {

	public static void main(String[] args) {
		
		
		VehicleFactory V1=new VehicleFactory();
	
		Car C1=new Car();
		C1.Start();
		System.out.println("\n");
		Bike B1=new Bike();
		B1.Start();
		
	}
}
