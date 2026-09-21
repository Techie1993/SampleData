package com.jtc.Hackerearth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExam {

	public static void main(String[] args) {
		
		
		Function<Integer,Integer>Data=num->num * num;
		
		System.out.println(Data.apply(5));
		
		
		Function<String,String>Result=car->car.toUpperCase();
		
		System.out.println(Result.apply("thar"));
		
		
		List<String>comp=Arrays.asList("cybage","capgemini","unacademy");
		
		comp.stream().map(e->e.toUpperCase()).forEach(System.out::println);
		
		System.out.println("Data\n");
		Function<Double,Double>SquareRoot=digit->Math.log(digit);
		
		System.out.println(SquareRoot.apply(25.0));
		
		System.out.println("BiFunction\n");
		
	BiFunction<Integer,Integer,Integer>Numbers=(a,b)->a+b;
	
	System.out.println(Numbers.apply(10,25));
	
	
	System.out.println("Function\n");
		
	Function<String,Integer>Res=(a)->a.length();
	
	List<String>Comp=Arrays.asList("accenture","capgemini","JP Morgan Stanley");
	
	String Max=Comp.stream().max(Comparator.comparingInt(String::length)).get();
	System.out.println(Max);
	
	
	
		
		
		

	}
}
