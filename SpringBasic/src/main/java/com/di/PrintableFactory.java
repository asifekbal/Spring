package com.di;

public class PrintableFactory {
	public  Printable getPrintable() {
		return new B();
	}

}
