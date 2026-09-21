package com.jtc.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OpsArray {

	public static void main(String[] args) {
		
		
		int Data[]= {1,2,3,4,5,6};
		
		int tar=6;
		
		
		for(int i=0;i<=Data.length-1;i++) {
			for(int k=i+1;k<=Data.length-1;k++) {
				if(Data[i]+Data[k]==tar) {
					System.out.println(Data[i]+"-"+Data[k]);
				}
			}
		}
		
		System.out.println("Sent reversal\n");
		
		String sent="java is good";
		
	String res=Arrays.stream(sent.split(" "))
			.map(e->new StringBuilder(e).reverse()).collect(Collectors.joining(" "));
	
	System.out.println(res);
	
	
		int num=6;
		
	int score=IntStream.rangeClosed(1,num).reduce(1,(a,b)->a * b);
	
	System.out.println(score);
	
	
	System.out.println("First Non Repeat\n");

	String word="java";
	
	Character non=word.chars().mapToObj(c->(char)c)
			.filter(e->word.indexOf(e)!=word.lastIndexOf(e)).findFirst().get();
	
	System.out.println(non);
	
	
	System.out.println("Intern\n");
	
	        
	String s1=new String("java");   // HEAP
	
	String s2="java";            // SCP
	
	System.out.println(s1==s2);
	
	s1=s1.intern();
	System.out.println(s1==s2);
	
	System.out.println("Array Rotation\n");
	
	int numbers[]= {1,2,3,4,5,6};
	
	int n=numbers.length;
	int k=2;
	int newarr[]=new int[numbers.length];
	
	
	for(int i=0;i<numbers.length;i++) {
		newarr[(i+k)%n]=numbers[i];
	}
	
	System.out.println(Arrays.toString(newarr));
	
	
	
	
	
	
	
	
	
	
		

	}

}
