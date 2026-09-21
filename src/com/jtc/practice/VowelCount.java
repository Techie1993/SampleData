package com.jtc.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class VowelCount {

	public static void main(String[] args) {
		
		
		int Data[]= {14,-5,21,-74,24};
		
		int result[]=IntStream.concat(Arrays.stream(Data).filter(e->e>0), 
				Arrays.stream(Data).filter(e->e<0)).toArray();
		
		System.out.println(Arrays.toString(result));
		
	
		String Comp="Delloite";
		
	List<Character>Vowels=Comp.chars().mapToObj(c->(char)c)
			.filter(e->"aeiou".indexOf(e)>=1).collect(Collectors.toList());
	
	System.out.println(Vowels);
		
		
	List<Character>Conso=Comp.chars().mapToObj(c->(char)c)
			.filter(e->"aeiou".indexOf(e)<=-1).collect(Collectors.toList());
	
		System.out.println(Conso);
		
		
		
		int Digits[]= {1,2,3,4,5};
		int rem=5;
		
		
		int[] newarr=new int[Digits.length-1];
		
		int j=0;
		
		for(int i=0;i<=Digits.length-1;i++) {
			if(Digits[i]!=rem) {
				newarr[j]=Digits[i];
				j++;
			}
		}
		
		System.out.println(Arrays.toString(newarr));
		
		
	}
}
