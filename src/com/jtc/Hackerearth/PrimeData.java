package com.jtc.Hackerearth;

import java.util.stream.IntStream;

public class PrimeData {

	public static void main(String[] args) {
		
		
		int num=31;
		
		
		
		boolean check=num>1 && IntStream.rangeClosed(2,(int)(Math.sqrt(num)))
				.noneMatch(i->num%i==0);
		
		System.out.println(check);
		
		
		
		
		
		
		
		

	}
}
