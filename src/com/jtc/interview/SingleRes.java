package com.jtc.interview;



class addition{
	
	public int Add(int a,int b) {
		System.out.println("Sum is:"+(a+b));
		return a+b;
	}
}

class Multiplication{
	
	public int Prod(int a,int b) {
		System.out.println("Product is:"+(a * b));
		return a*b;
	}
}

public class SingleRes {

	public static void main(String[] args) {
		addition add=new addition();
		add.Add(10, 20);
		
		System.out.println("Multiplication\n");
		
		Multiplication prod=new Multiplication();
		prod.Prod(10,5);
		
		

	}
}
