package com.jtc.practice;

public class ExceptionError {

	public static void main(String[] args) {
		
		
		
		try {
		    int x = 10 / 0;
		} catch (Exception e) {
		    System.out.println("Exception");
		} finally {
		    System.out.println("Finally");
		}

	}
}
