package com.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class TrackOperation {

	public void myadvice(JoinPoint jp,Throwable ayesha)  {
		System.out.println("Additional Concern Before!!");
		System.out.println("Method Signature is " + jp.getSignature());
		System.out.println("Exception is " + ayesha);
		System.out.println("Additional Concern After!!");
	}
}
