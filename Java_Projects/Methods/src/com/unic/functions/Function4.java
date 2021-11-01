package com.unic.functions;

public class Function4 
{
	public static void main(String[] args) {
		System.out.println(myMethod(5));
		System.out.println(myMethod(5));
	}
	
	static int myMethod(int x) {
		return ++x;
	}
	
	static int myMethod2(int y) {
		return y++;
	}
}