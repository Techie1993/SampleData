package com.jtc.practice;


class Driving extends Exception{
	
	public Driving(String message) {
		super(message);
	}
}


class DriversData{
	
	
	public static void Validate(String data) throws Driving {
		if(data.matches("[A-Z0-9]{10}")) {
			System.out.println("valid");
		}else {
			throw new Driving("Invalid");
		}
	}
}

public class DrivingLicense {

	public static void main(String[] args) throws Driving {
		DriversData D1=new DriversData();
		D1.Validate("MH40T21711");

	}
}
