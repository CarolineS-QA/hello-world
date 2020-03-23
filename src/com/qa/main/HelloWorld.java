package com.qa.main;

public class HelloWorld {
	
	static String hellovar = "Hello World!";
	public static String writesHelloWorld() {
		return hellovar;
	}
	
	public static void main(String[] args) {
		System.out.println(writesHelloWorld());
	}

}
