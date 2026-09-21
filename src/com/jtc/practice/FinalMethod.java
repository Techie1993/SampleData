package com.jtc.practice;



class Veh{
	
	public final void Drive() {
		System.out.println("Vehicle Started!");
	}	
}


class VehDetails extends Veh{
	
	public final void Drive(int avg) {
		System.out.println("Average started!");
	}
}

public class FinalMethod {

	public static void main(String[] args) {
		Veh v1=new Veh();
		v1.Drive();
		
		System.out.println("\n");
		
		VehDetails v2=new VehDetails();
		v2.Drive(35);

	}
}
