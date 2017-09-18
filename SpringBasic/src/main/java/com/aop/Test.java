package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.Operation;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Customer.xml");
		CustomerService cs = (CustomerService) context.getBean("customerService");
		cs.printName();
		cs.printUrl();
		cs.printThrowException();
	}
}
