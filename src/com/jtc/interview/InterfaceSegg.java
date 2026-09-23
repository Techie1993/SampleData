package com.jtc.interview;


interface Add{
	void add();
}

interface Subs{
	void sub();
}

interface Multiply{
	void prod();
}


class Digits implements Add{

	@Override
	public void add() {
		System.out.println("Addition done!");
	}
}

class Numbers implements Subs{

	@Override
	public void sub() {
		System.out.println("Substraction Done!");
	}
}

public class InterfaceSegg {

	public static void main(String[] args) {
		
		Digits D1=new Digits();
		D1.add();
		
		System.out.println("\n");
		
		Numbers N1=new Numbers();
		
		N1.sub();
		

	}
}
