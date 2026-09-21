package com.jtc.DesignPattern;


class Factory{
	
	public Vehicle3 getObj(String message) {
		if(message.equalsIgnoreCase("Truck")) {
			return new Truck();
		}else if(message.equalsIgnoreCase("Tractor")) {
			return new Tractor();
		}
		return null;
	}
}
public class VehFactory {

	public static void main(String[] args) {
		
		Factory F1=new Factory();
		Vehicle3 V1=F1.getObj("Truck");
		V1.Drive();
		System.out.println("\n");
		
		Vehicle3 V2=F1.getObj("Tractor");
		V2.Drive();
	}
}
