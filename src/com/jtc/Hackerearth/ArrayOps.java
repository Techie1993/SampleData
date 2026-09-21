package com.jtc.Hackerearth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayOps {

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
		
	
		System.out.println("Element removal\n");
		
		
		int rem=3;
		int newarr[]=new int[Data.length-1];
		int j=0;
		
		for(int i=0;i<=Data.length-1;i++) {
			if(Data[i]!=rem) {
				newarr[j]=Data[i];
				j++;
			}
		}
		
		
		System.out.println(Arrays.toString(newarr));
		
		System.out.println("Seperating all zeros one side\n");
		
		int Digits[]= {1,0,4,0,5,0,6};
		
		
	int res[]=IntStream.concat(Arrays.stream(Digits).filter(e->e==0), 
			Arrays.stream(Digits).filter(e->e!=0)).toArray();
	
	System.out.println(Arrays.toString(res));
		
	System.out.println("Second Highest\n");
		
		int numb[]= {4,5,6,7,8};
		
		ArrayList<Integer>Result=Arrays.stream(numb)
				.boxed().collect(Collectors.toCollection(ArrayList::new));
		
		int sec=Result.stream().sorted((a,b)->b.compareTo(a)).skip(1).findFirst().get();
		System.out.println("Second Highest is:"+sec);
		
	
		System.out.println("Missing Element\n");
		
		int Numbs[]= {4,5,7,8,9};
		int sum=0;
		
		for(int i=0;i<=Numbs.length-1;i++) {
			sum=sum+Numbs[i];
		}
		System.out.println("Sum is:"+sum);
		
		int total=0;
		
		for(int k=4;k<=9;k++) {
			total=total+k;
		}
		
		System.out.println("Missing is:"+(total-sum));
		
		System.out.println("Longest String\n");
		
		String comp[]= {"Accenture","JP Morgan Stanley","TCS"};
		
		String Max=comp[0];
		
		
		for(int i=0;i<=comp.length-1;i++) {
			if(comp[i].length()>Max.length()) {
				Max=comp[i];
			}
		}
		System.out.println("Maximum length is:"+Max);
		
		
		System.out.println("Arrays Merge\n");
		
		int arr1[]= {1,4,5};
		int arr2[]= {5,6,7};
		
		int finalres[]=IntStream.concat(Arrays.stream(arr1), 
				Arrays.stream(arr2)).toArray();
		
		System.out.println(Arrays.toString(finalres));
		
		
		String comp1[]= {"tcs","hcl","JP Moragan stanley"};
		String comp2[]= {"Mphasis","L&T","capgemini"};
		
		
		String org[]=Stream.concat(Arrays.stream(comp1), 
				Arrays.stream(comp2)).toArray(String[]::new);
		
		System.err.println(Arrays.toString(org));
		
		
		
	System.out.println("Duplicates\n");
		
	List<String>Orgy=Arrays.asList("CapG","Accenture","CapG","TCS");
	
	List<String>Dup=Orgy.stream().filter(e->Collections.frequency(Orgy,e)>1).toList();
	
	System.out.println(Dup);
		
		
		
		String lang="java";
		
	Map<Character,Long>Res=lang.chars().mapToObj(c->(char)c)
			.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
	System.out.println(Res);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
