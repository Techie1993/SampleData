package com.jtc.Hackerearth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OperationsArrays {

	public static void main(String[] args) {
		

		int Data[]= {14,21,12,61,22};
		
		int rem=21;
		
		int newarr[]=new int[Data.length-1];
		int j=0;
		
		for(int i=0;i<=Data.length-1;i++) {
			if(Data[i]!=rem) {
				newarr[j]=Data[i];
				j++;
			}
		}
		
		System.out.println(Arrays.toString(newarr));
		
		System.out.println("Max length of String\n");
		
	  String comp[]= {"Accenture","CapG","HCL","Google","JP Morgan Stanley"};
			
		String Max=comp[0];
		
		for(int i=0;i<=comp.length-1;i++) {
			
			if(comp[i].length()>Max.length()) {
				Max=comp[i];
			}
		}
		
		System.out.println(Max);
		
		System.out.println("Seggregating elements\n");
		
		int digits[]= {14,-8,21,-19,44,-9,32};
		
		
	int res[]=IntStream.concat(Arrays.stream(digits).filter(e->e>1), 
			Arrays.stream(digits).filter(e->e<=0)).toArray();
	
	System.out.println(Arrays.toString(res));
		
		
	System.out.println("Seperating Vowels and Consonents\n");
	
	String Org="Delloite";
	
	List<Character>Vowels=Org.chars().mapToObj(c->(char)c).filter(e->"aeiou".indexOf(e)>=0).toList();
	
	System.out.println(Vowels);
		
	System.out.println("\n");
		
	List<Character>Conso=Org.chars().mapToObj(c->(char)c).filter(e->"aeiou".indexOf(e)<=0).toList();
		
	System.out.println(Conso);
		
	
	String word="java";
	
	Map<Character,Long>Count=word.chars().mapToObj(c->(char)c)
			.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
	System.out.println(Count);
	
	System.out.println("String reversal\n");
	
	String sent="spring boot is framework";

	String rev=Arrays.stream(sent.split(" "))
			.map(e->new StringBuilder(e).reverse().toString()).collect(Collectors.joining(" "));
	
	System.out.println(rev);
	
	System.out.println("Checking palindrome\n");
	
	String name="naman";
	
	boolean isPalindrome=name.equals(new StringBuilder(name).reverse().toString());
	System.out.println(isPalindrome);
	
	
	System.out.println("Words Count\n");
	
	String data="java is backend java ";
	
	Map<String,Long>wcount=Arrays.stream(data.split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
	System.out.println(wcount);
	
	
	int Numbers[]= {1,2,3,4,5,6};
	int tar=2;
	
	
	for(int i=0;i<=Numbers.length-1;i++) {
		for(int k=i+1;k<=Numbers.length-1;k++) {
			if(Numbers[i]+Numbers[k]==tar) {
				
				System.out.println(Numbers[i]+"-"+Numbers[k]);
			}	
		}
		
	  }
	
	System.out.println("Finding Duplicates\n");
	
	List<String>Org1=Arrays.asList("HCL","HCL","TCS","Infosys");
	
	List<String>Dup=Org1.stream().filter(e->Collections.frequency(Org1,e)>1).toList();
	
	System.out.println(Dup);
	
	System.out.println("First Non repeat\n");
	
	String lang="java";
	
	Character result=lang.chars().mapToObj(c->(char)c)
			.filter(e->lang.indexOf(lang)==lang.indexOf(e)).findFirst().get();
	
	System.out.println(result);
	
	
	
	int nums[]= {1,2,3,4,5};
	
	ArrayList<Integer>Result=Arrays.stream(nums).boxed().collect(Collectors.toCollection(ArrayList::new));
	
	int sec=Result.stream().sorted((a,b)->b.compareTo(a)).skip(1).findFirst().get();
	System.out.println(sec);
	
	
	
	
	
	
	
	
	
	
	}
}
