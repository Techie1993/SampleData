package com.jtc.practice;


class Data{
	
	
	private static Data obj;
	
	private Data() {
		System.out.println("private cons called");
	}
	
	public static Data getInst() {
		if(obj==null) {
			obj=new Data();
		}
		return obj;
	}
	
	public void ShowMsg() {
		System.out.println("****");
	}
}

public class Singleton {

	public static void main(String[] args) {
	
		Data D1=Data.getInst();
		D1.ShowMsg();
		
		
		
	}
}
