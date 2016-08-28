package com.kitty.algo;

public class SimpleRecursiveFunc {

	public static void main(String[] args) {
		int n=3;
		int value = func1(n);
		System.out.println(String.format("Function value for %d is %d.", n, value));
	}
	
	public static int func1(int n){
		if(n==0) return 0;
		int value = (n*n) + 2*func1(n-1);
		System.out.println(String.format("Return value for %d is %d.", n, value));
		return value;
	}

}
