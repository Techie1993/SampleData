package com.jtc.practice;


class Banking{
	
	String name;
	long accno;
	int bal;
	
	public Banking(String name, long accno, int bal) {
		super();
		this.name = name;
		this.accno = accno;
		this.bal = bal;
	}
	public String getName() {
		return name;
	}

	public long getAccno() {
		return accno;
	}

	public int getBal() {
		return bal;
	}

	public String toString() {
		return "Banking [name=" + name + ", accno=" + accno + ", bal=" + bal + "]";
	}
}

public class DataEncapsulate {

	public static void main(String[] args) {
		Banking B1=new Banking("Akshay",123456,78000);
		System.out.println(B1.getName());
		System.out.println(B1.getBal());
		

	}
}
