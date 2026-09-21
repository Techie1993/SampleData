package com.jtc.DesignPattern;
import com.jtc.practice.Vehicle;

interface Vehicle3{
	void Drive();
}


class Truck implements Vehicle3{

	@Override
	public void Drive() {
		System.out.println("Truck Started!");
		
	}
}


class Tractor implements Vehicle3{

	@Override
	public void Drive() {
		System.out.println("Tractor Started!");	
	}
}

public class DesignPatterns {

	public static void main(String[] args) {
		
		Truck T1=new Truck();
		T1.Drive();
		
		System.out.println("\n");
		Tractor trac=new Tractor();
		trac.Drive();
			
	}
}
