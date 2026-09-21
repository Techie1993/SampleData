package com.jtc.Hackerearth;

import java.util.stream.IntStream;

public class CheckPrime {

	public static void main(String[] args) {
		
		
		int num=29;
		
		
		boolean check=num>1 && IntStream.rangeClosed(2,(int)Math.sqrt(num))
				.noneMatch(i->num%i==0);
		
		System.out.println(check);
		
		
		System.out.println(Math.sqrt(29));
		
		
		

	}
}
