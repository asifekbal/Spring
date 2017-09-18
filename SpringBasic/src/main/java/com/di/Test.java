package com.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.Operation;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Operation  op = (Operation) context.getBean("op");
		System.out.println("Calling msg()");
		op.msg();
		System.out.println("Calling m()");
		op.m();
		System.out.println("Calling k()");
		op.k();
		System.out.println("Calling validate()");
		op.validate(19);
		System.out.println("Calling validate() Again");
		op.validate(17);
	}
}
