package com.jtc.Hackerearth;


class SingletonData{
	
	
	private static SingletonData obj;
	
	SingletonData() {
		System.out.println("private constructor");
	}
	
	
	public static SingletonData Show() {
		if(obj==null) {
			SingletonData obj=new SingletonData();
			
		}
		return obj;
	}
	
	public void ShowMesssage() {
		System.out.println("***");
	}
}

public class Singleton {

	public static void main(String[] args) {

		SingletonData sing=new SingletonData();
		
		sing.ShowMesssage();
		
	}
}
