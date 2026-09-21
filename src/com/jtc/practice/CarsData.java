package com.jtc.practice;


class Vehicles{
	
	public synchronized void SUV() throws InterruptedException {
		String Cars[]= {"Creta","Safari","XUV-500","Pajero","Thar-Roxx"};
		
		for(int i=0;i<=Cars.length-1;i++) {
			System.out.println(Cars[i]);
			Thread.sleep(1000);
		}
			
	}
	
	
	public synchronized void Sedan() throws InterruptedException {
		String Sedan[]= {"City","Santro","Civic"};
		
		for(int i=0;i<=Sedan.length-1;i++) {
			System.out.println(Sedan[i]);
			Thread.sleep(1000);
		}
			
	}
}



class MySUV extends Thread{
	
	Vehicles veh;

	public MySUV(Vehicles veh) {
		super();
		this.veh = veh;
	}
	
	public void run() {
		try {
			veh.SUV();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
}


class MySedan extends Thread{
	
	Vehicles veh;

	public MySedan(Vehicles veh) {
		super();
		this.veh = veh;
	}
	
	public void run() {
		try {
			veh.Sedan();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}	
}

public class CarsData {

	public static void main(String[] args) throws InterruptedException {
		
		Vehicles V1=new Vehicles();
		
		MySUV S1=new MySUV(V1);
		
		S1.start();
		S1.join();
		
		MySedan sedan=new MySedan(V1);
		sedan.start();
		
	}

}
