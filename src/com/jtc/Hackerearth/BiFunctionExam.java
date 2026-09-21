package com.jtc.Hackerearth;

import java.util.function.BiFunction;

public class BiFunctionExam {

	public static void main(String[] args) {
		
		BiFunction<Integer,Integer,Integer>Numbers=(a,b)->a*a + b * b;
		System.out.println(Numbers.apply(5,4));
		
		
		BiFunction<String,String,String>Result=(a,b)->a.toUpperCase()+"-"+b.toUpperCase();
		
		System.out.println(Result.apply("thar","safari"));
		
		
		
		
		
	}
}
