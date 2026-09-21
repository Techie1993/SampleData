package com.jtc.practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor {

	public static void main(String[] args) {
		
		
		ExecutorService executor=Executors.newFixedThreadPool(5);
		
		
		for(int i=0;i<=5;i++) {
			int num=i;
			
			executor.submit(()->{
				System.out.println(num+"-"+Thread.currentThread().getName());
			});
		}
		
		executor.shutdown();
		
	}
}
