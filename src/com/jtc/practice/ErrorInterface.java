package com.jtc.practice;



interface A{
	default void show() {
		System.out.println("A is started!");
	}
}


interface B{
	default void show() {
		System.out.println("B is started!");
	}
}


class Dev implements A,B{
	
}

public class ErrorInterface {

	public static void main(String[] args) {
		Dev d1=new Dev();
		d1.show();
		
	}
}
