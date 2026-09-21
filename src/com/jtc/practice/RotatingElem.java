package com.jtc.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RotatingElem {

	public static void main(String[] args) {
		
		
		int Data[]= {1,2,3,4,5};
		
		int k=2;
		int n=Data.length;
		int newarr[]=new int[Data.length];
		
		
		for(int i=0;i<=Data.length-1;i++) {
			newarr[(i+k)%n]=Data[i];
		}
		
		System.out.println(Arrays.toString(newarr));
		
		System.out.println("Shifitng all Zeros to one side\n");
		
		int Digits[]= {0,10,0,21,0,5,6,0,7};
		
	int res[]=IntStream.concat(Arrays.stream(Digits).filter(e->e!=0),
			Arrays.stream(Digits).filter(e->e==0)).toArray();
	
	System.out.println(Arrays.toString(res));
	
		System.out.println("Shifiting 0 \n");
		
		
		int Nums[]= {0,10,0,21,0,5,6,0,7};
		
		int out[]=IntStream.concat(
				Arrays.stream(Nums).filter(e->e!=0), 
				Arrays.stream(Nums).filter(e->e==0)).toArray();
		
		System.out.println(Arrays.toString(out));
		
		
		ArrayList<Integer>output=Arrays.stream(Nums).boxed()
				.collect(Collectors.toCollection(ArrayList::new));
		
		Integer sec=output.stream().sorted((a,b)->b.compareTo(a)).skip(1).findFirst().get();
		
		System.out.println(sec);
		
	
	}
}
