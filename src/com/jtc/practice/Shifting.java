package com.jtc.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Shifting {

	public static void main(String[] args) {
		
		
		int Data[]= {1,2,3,4,5};

		
	ArrayList<Integer>res=Arrays.stream(Data).boxed()
			.collect(Collectors.toCollection(ArrayList::new));
	
	Collections.rotate(res,2);
	
	System.out.println(res);
		
	
	
	System.out.println("Traditional\n");
		
		int k=3;
		int n=Data.length;
		int newarr[]=new int[Data.length];
		
		
		for(int i=0;i<=Data.length-1;i++) {
			newarr[(i+k)%n]=Data[i];
		}
		
		System.out.println(Arrays.toString(newarr));
		
		
		
		String comp="Delloite";
		
		
	List<Character>Vowels=comp.chars().mapToObj(c->(char)c)
			.filter(e->"aeiou".indexOf(e)>=0).collect(Collectors.toList());
	System.out.println(Vowels);
	
	
	List<Character>Conso=comp.chars().mapToObj(c->(char)c)
			.filter(e->"aeiou".indexOf(e)<=0).collect(Collectors.toList());
	
	System.out.println(Conso);
		
		
		
	System.out.println("Seggregation\n");
		
	
	int nums[]= {1,-2,3,4,-5,9};
	
	
	int result[]=IntStream.concat(Arrays.stream(nums).filter(e->e>=0), 
			Arrays.stream(nums).filter(e->e<=0)).toArray();
	
	System.out.println(Arrays.toString(result));
	System.out.println("\n");
		
		int num=5;
		
	int facto=IntStream.rangeClosed(1, num).reduce(1,(a,b)->a * b);
	
	System.out.println(facto);
	
		

	}
}
