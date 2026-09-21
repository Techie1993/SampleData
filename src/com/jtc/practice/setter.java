package com.jtc.practice;


class Enginne{
	
	public void start() {
		System.out.println("Engine Started!");
	}
}


class Truckk{
	
	private Enginne engine;

	public void setEngine(Enginne engine) {
		this.engine = engine;
	}
	
     public void Start() {
    	 System.out.println("Truck is started");
     }
}


public class setter {

	public static void main(String[] args) {
		Enginne eng=new Enginne();
		Truckk T1=new Truckk();
		T1.setEngine(eng);
		T1.Start();
	}
}
