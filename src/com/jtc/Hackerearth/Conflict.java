package com.jtc.Hackerearth;


interface A{
	public default void Show() {
		System.out.println("A in show");
	}
}

interface B{
	public default void Show() {
		System.out.println("B in show");
	}
}

class C implements A,B{

	@Override
	public void Show() {
		
		A.super.Show();
	}
}

public class Conflict {

	public static void main(String[] args) {
		C c=new C();
		c.Show();

	}
}
