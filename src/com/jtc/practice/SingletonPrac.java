package com.jtc.practice;



class Details{
	
	private static Details obj;
	
	private Details() {
		System.out.println("Private Cons Called...");
	}
	
	public static Details getInst() {
		if(obj==null) {
			obj=new Details();
		}
		return obj;
	}
	
	public void ShowMsg() {
		System.out.println("****");
	}
}

public class SingletonPrac {

	public static void main(String[] args) {
		
		
		Details D1=Details.getInst();
		D1.ShowMsg();
		

	}
}
