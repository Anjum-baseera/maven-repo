package com.lti;

public class Calc {
	public static int add(int num1,int num2) {
		return num1+num2;
	}
	public static int sub(int num1,int num2) {
		return num1-num2;
	}
	public static int prod(int num1,int num2) {
		return num1*num2;
	}
	public static void main(String[] args) {
		System.out.println("Sum="+add(10,20));
		System.out.println("Diffs="+sub(90,20));
		System.out.println("Prod="+prod(20,20));
	}	
}
