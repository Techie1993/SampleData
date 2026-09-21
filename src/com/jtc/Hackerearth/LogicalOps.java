package com.jtc.Hackerearth;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LogicalOps {

	public static void main(String[] args) {
		
		
		int Data[]= {21,24,15,55,84};
		
		int rem=24;
		int newarr[]=new int[Data.length-1];
		int j=0;
		
		
		for(int i=0;i<=Data.length-1;i++) {
			if(Data[i]!=rem) {
				newarr[j]=Data[i];
				j++;
			}
		}
		
		System.out.println(Arrays.toString(newarr));
		
		
		System.out.println("Rotation\n");
		
		int n=Data.length;
		int k=2;
		int empty[]=new int[Data.length];
		
		
		for(int i=0;i<=Data.length-1;i++) {
			empty[(i+k)%n]=Data[i];
		}
		
		System.out.println(Arrays.toString(empty));
		
		
		System.out.println("Seggregating all negative and positive elements\n");
		
		int digits[]= {1,4,-8,-41,21,-27,55,44};
		
		int res[]=IntStream.concat(Arrays.stream(digits).filter(e->e>1),
				Arrays.stream(digits).filter(e->e<=0)).toArray();
		
		System.out.println(Arrays.toString(res));
		
		System.out.println("Data Sum\n");
		
		int Numbers[]= {1,2,3,4,5,6};
		int target=6;
		
		
		for(int i=0;i<=Numbers.length-1;i++) {
			for(int g=i+1;g<=Numbers.length-1;g++) {
				if(Numbers[i]+Numbers[g]==target) {
					System.out.println(Numbers[i]+"-"+Numbers[g]);
				}
			}
		}
		
		
		System.out.println("Vowels and Consonents\n");
		
		String comp="Delloite";
		
		List<Character>Vowels=comp.chars().mapToObj(c->(char)c)
				.filter(e->"aeiou".indexOf(e)>=1).toList();
		
		System.out.println(Vowels);
		
		System.out.println("\n");
		
		List<Character>Conso=comp.chars().mapToObj(c->(char)c)
				.filter(e->"aeiou".indexOf(e)<=0).toList();
		
		System.out.println(Conso);
		
		
		System.out.println("Duplicate Data\n");
		

  List<String>Org=Arrays.asList("HCL","HCL","CapG","Delloite");
  
  List<String>Dup=Org.stream().filter(e->Collections.frequency(Org,e)>1).collect(Collectors.toList());
 
  	System.out.println(Dup);
		
		
		
		
		

	}
}
