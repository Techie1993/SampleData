package com.jtc.practice;


class Singlleton{
	
	private  static Singlleton obj;
	
	Singlleton() {
		System.out.println("Private Constructor Called!");
	}
	
	public Singlleton getInst() {
		if(obj==null) {
			obj=new Singlleton();
		}
		return obj;
	}
	
	public void show() {
		System.out.println("***");
	}
}

public class DesignsSingleton {

	public static void main(String[] args) {
		Singlleton S1=new Singlleton();
		S1.show();
		
		

	}
}
