package com.jtc.factory;



class DesignFactory{
	
	public Vehicle2 getObject(String message) {
		if(message.equalsIgnoreCase("Truck")) {
			return new Truck();
		}else if(message.equalsIgnoreCase("Tractor")) {
			return new Tractor();
		}
		return null;
	}
}

public class Design {

	public static void main(String[] args) {
		
		DesignFactory D1=new DesignFactory();
		Vehicle2 T2=D1.getObject("Truck");
		T2.drive();
		
	}
}
