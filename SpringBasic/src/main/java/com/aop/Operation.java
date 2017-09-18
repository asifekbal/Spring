package com.aop;

public class Operation {
	public void msg() {
		System.out.println("Msg method invoked!");
	}
	public int m() {
		System.out.println("M method invoked!");
		return 2;
	}
	public int k() {
		System.out.println("K method invoked!");
		return 3;
	}
	public void validate(int age) {
		if(age>18) {
			System.out.println("thanks for your vote!!1");
		} else {
			throw new ArithmeticException("Age not valid!");
		}
	}
}
