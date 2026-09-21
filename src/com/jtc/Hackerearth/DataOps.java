package com.jtc.Hackerearth;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DataOps {

	public static void main(String[] args) {
		

		int Data[]= {4,1,7,9,14};
		
		int rem=Data[1];
		int newarr[]=new int[Data.length-1];
		int j=0;
		
		
		for(int i=0;i<=Data.length-1;i++) {
			if(Data[i]!=rem) {
				newarr[j]=Data[i];
				j++;
			}
		}
		
		System.out.println(Arrays.toString(newarr));
		
		
		System.out.println("Missing Data\n");
		
		int Digits[]= {1,2,4,5,6};
		
		int sum=0;
		
		for(int i=0;i<=Digits.length-1;i++) {
			sum=sum+Digits[i];
		}
		
		System.out.println("Sum is:"+sum);
		
		int total=0;
		
		for(int i=1;i<=6;i++) {
			total=total+i;
		}
		
		System.out.println("Missing number is:"+(total-sum));
		
		System.out.println("Seggrgating greter than 5\n");
		
		
		
		int nums[]= {14,5,1,2,24,26};
		
		int result[]=IntStream.concat(Arrays.stream(nums).filter(e->e>5), 
				Arrays.stream(nums).filter(e->e<5)).toArray();
		
		System.out.println(Arrays.toString(result));
		
		
		List<String>Words=Arrays.asList("java","is","Backend");
		
		String Result=Words.stream()
				.collect(Collectors.joining("-"));
		
		System.out.println(Result);
		
		System.out.println("Counting\n");
		
		List<String>Comp=Arrays.asList("abc","xyz","edf");
		
		long count=Comp.stream().count();
		System.out.println(count);
		
		
		System.out.println("palindrome\n");
		
		String name="nayan";
		
		boolean isCheck=name.equals(new StringBuilder(name).reverse().toString());
		
		System.out.println(isCheck);
		
		System.out.println("Finding Factorial\n");
		
		int number=5;
		
		int fact=IntStream.rangeClosed(1, number).reduce(1,(a,b)->a * b);
		System.out.println(fact);
		
		System.out.println("Reverse\n");
		
		
		String sent="Spring is fun";
		
	String result1=Arrays.stream(sent.split(" "))
			.map(e->new StringBuilder(e).reverse().toString()).collect(Collectors.joining("-"));
	
	System.out.println(result1);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
