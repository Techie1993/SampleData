package com.jtc.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Maths {

	public static void main(String[] args) {
		
	List<Integer>Data=Arrays.asList(2,3,4,5);
	
	int sec=Data.stream().sorted((a,b)->b.compareTo(a)).skip(1).findFirst().get();
		System.out.println(sec);
		
	List<Integer> even=Data.stream().filter(e->e%2==0).collect(Collectors.toList());
	System.out.println(even);

	}
}
