package com.jtc.factory;


public class VehicleFactory {

	
	public Vehicle getObject(String type) {
		if(type.equalsIgnoreCase("Car")) {
			return new Car();
		}else if(type.equalsIgnoreCase("Bike")) {
			return new Bike();
		}else {
			return null;
		}
	}	
}
