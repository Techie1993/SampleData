package com.jtc.practice;


class Message{
	
	public static String Show(String message) {
		String msg="Hello"+" "+message;
		return msg;
		
	}
}

public class Divide {

	public static void main(String[] args) {
		
		Message M1=new Message();
		System.out.println(M1.Show("Jerry!"));
		
		
	
	}
}
