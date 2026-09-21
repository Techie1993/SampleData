package com.jtc.practice;


class Detailss{
	
	private static Detailss obj;
	
	
	private Detailss() {
		System.out.println("Private Cons Called");
	}
	
	public static Detailss getInst() {
		if(obj==null) {
			obj=new Detailss();
		}
		return obj;
	}
	
	public void ShowMsg() {
		System.out.println("***");
	}
}

public class DesignPatterns {

	public static void main(String[] args) {
		
		Detailss D1=Detailss.getInst();
		D1.ShowMsg();
		
		
		
		
	}
}
