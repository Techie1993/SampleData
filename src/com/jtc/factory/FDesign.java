package com.jtc.factory;


interface Vehicle1{
	void Show();
}


class Cars implements Vehicle1{

	@Override
	public void Show() {
		System.out.println("Car Started!");
		
	}
}

class Bikes implements Vehicle1{

	@Override
	public void Show() {
		System.out.println("Bike Started!");	
	}
}

public class FDesign {

	public static void main(String[] args) {
		

	}

}
