package com.jtc.practice;



class Parent{
	
	public void Show() {
		System.out.println("Parent Method executed");
	}
}


class child extends Parent{
	
	public void Show() {
		System.out.println("Child Method executed");
	}
}

public class Override {

	public static void main(String[] args) {
	
		Parent P1=new child();
		P1.Show();
	}
}
