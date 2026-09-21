package com.jtc.practice;


class Dataa{
	
	private static Dataa obj;
	
	Dataa() {
		System.out.println("Private Constructor Called!");
	}
	
	public static Dataa getInst() {
		if(obj==null) {
			obj=new Dataa();
		}
		return obj;
	}

	public void Show() {
		System.out.println("***");
	}
}

public class Singletonn {

	public static void main(String[] args) {
		
		Dataa D1=new Dataa();
		
		
		D1.Show();
		
		
		

	}

}
