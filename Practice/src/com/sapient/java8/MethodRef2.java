package com.sapient.java8;

interface Method {
	void say();
}

interface Method2 {
	int operator(int a, int b);
}

public class MethodRef2 {

	public static void saySomething() {
		System.out.println("hello hai");
	}

	public static int operators(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {

		Method sayable = MethodRef2::saySomething;
		sayable.say();
		Method2 m2 = MethodRef2::operators;
		System.out.println(m2.operator(23, 33));
		Thread th = new Thread(MethodRef2::saySomething);
		th.start();
	}
}
