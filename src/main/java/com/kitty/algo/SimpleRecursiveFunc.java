package com.kitty.algo;

public class SimpleRecursiveFunc {

	public static void main(String[] args) {
		int n=12903;
		printDigit(n);
	}
	
	public static int func1(int n){
		if(n==0) return 0;
		int value = (n*n) + 2*func1(n-1);
		return value;
	}
	
	public static void printDigit(int n){
		if(n>=10)
			printDigit(n/10);
		System.out.print(n%10);
	}

}
