package com.jtc.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayOperations {

	public static void main(String[] args) {
		
		int Data[]= {14,22,32,10};
		int tar=32;
		
		int empty[]=new int[Data.length-1];
		int j=0;
		
		for(int i=0;i<=Data.length-1;i++) {
			if(Data[i]!=tar) {
				empty[j]=Data[i];
				j++;
			}
		}
		
		for(int i=0;i<j;i++) {
			System.out.println(empty[i]);
		}
		
		System.out.println("Rotation\n");
		
		
		int Digits[]= {10,12,32,24,25};
		int k=2;
		int n=Digits.length;
		int newarr[]=new int[Digits.length];
		
		
		for(int i=0;i<=Digits.length-1;i++) {
			newarr[(i+k)%n]=Digits[i];
		}
		
		System.out.println(Arrays.toString(newarr));
		
		
		int Digitss[]= {1,0,2,0,3,4,0,14};
		
		
	int result[]=IntStream.concat(Arrays.stream(Digitss).filter(e->e!=0),
			Arrays.stream(Digitss).filter(e->e==0)).toArray();
	
	System.out.println(Arrays.toString(result));
	
	
	System.out.println("Finding the second Highest\n");
	
	int numbs[]= {4,5,6,7};
	
	
	ArrayList<Integer>out=Arrays.stream(numbs).boxed()
			.collect(Collectors.toCollection(ArrayList::new));
	
	int sec=out.stream().sorted((a,b)->b.compareTo(a)).skip(1).findFirst().get();
	System.out.println(sec);
	
	
	int a=10;
	int b=10;
	System.out.println(a==b);
	
	
	String s1="java";
	String s2="java";
	String s3=new String("java");
	
	System.out.println(s1==s2);
	System.out.println(s1==s3);
	System.out.println(s2.equals(s3));
	
	
	System.out.println("Non Repeat\n");
	String word="india";
	
	List<Character>Result=word.chars().mapToObj(c->(char)c).filter(e->"aeiou".indexOf(e)>=0).collect(Collectors.toList());
	System.out.println(Result);
	
	
	List<Character>Conso=word.chars().mapToObj(c->(char)c).filter(e->"aeiou".indexOf(e)<=0).collect(Collectors.toList());
	System.out.println(Conso);
	
	
	System.out.println("Seperating Vowels and Conso\n");
	
	String comp="infosys";
	List<Character>vowels=comp.chars().mapToObj(c->(char)c)
			.filter(e->"aeiou".indexOf(e)>=0)
			.collect(Collectors.toList());
	
	System.out.println(vowels);
	
	System.out.println("Consonants\n");
	
	List<Character>Consonents=comp.chars().mapToObj(c->(char)c)
			.filter(e->"aeiou".indexOf(e)<=0)
			.collect(Collectors.toList());
	

	System.out.println(Consonents);
	
	
	System.out.println("Non repeat\n");
	
	String Comp="infosys";
	
	Character non=Comp.chars().mapToObj(c->(char)c)
			.filter(ch->Comp.indexOf(ch)==Comp.lastIndexOf(ch)).findFirst().get();
	
		System.out.println(non);
	
	
	System.out.println("Zero one side\n");
	
	int Numbers[]= {4,0,14,0,5,0,15};
	
	
	int Output[]=IntStream.concat(Arrays.stream(Numbers).filter(e->e!=0), 
			Arrays.stream(Numbers).filter(e->e==0)).toArray();
	
	System.out.println(Arrays.toString(Output));
	
	
	System.out.println("Seperating Vowels and Conso\n");
	
	List<Character>Vowels=Comp.chars().mapToObj(c->(char)c)
			.filter(e->"aeiou".indexOf(e)>=0).collect(Collectors.toList());
	
	System.out.println(Vowels);
	
	
	
	List<Character>Consonents1=Comp.chars().mapToObj(c->(char)c)
			.filter(e->"aeiou".indexOf(e)<=0).collect(Collectors.toList());
	
	System.out.println(Consonents1);
	
	
	System.out.println("Seperating All the Negative Elements\n");
	
	
	int Info[]= {1,-4,5,-7,8,-10};
	
	
	int Resultt[]=IntStream.concat(Arrays.stream(Info).filter(e->e>0),
			Arrays.stream(Info).filter(e->e<0)).toArray();
			
	
	System.out.println(Arrays.toString(Resultt));
	
	
	System.out.println("Finding Duplicates\n");
	
	
	int DupData[]= {10,14,10,25};
	
	
	for(int i=0;i<=DupData.length-1;i++) {
		for(int h=i+1;h<=DupData.length-1;h++) {
			if(DupData[i]==DupData[h]) {
				System.out.println(DupData[i]);
			}
		}
	}
	}
}

