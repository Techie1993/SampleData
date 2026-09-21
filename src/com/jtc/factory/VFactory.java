package com.jtc.factory;


class Factory{
	
	public Vehicle1 getObject(String type) {
		if(type.equalsIgnoreCase("Cars")) {
			return new Cars();
		}else if(type.equalsIgnoreCase("Bikes")) {
			return new Bikes();
		}
		return null;
	}
}

public class VFactory {

	public static void main(String[] args) {
		
		Factory F1=new Factory();
		Vehicle1 C1=F1.getObject("Cars");
		
		C1.Show();
		
		Vehicle1 B1=F1.getObject("Bikes");
		B1.Show();
		
		

	}
}
