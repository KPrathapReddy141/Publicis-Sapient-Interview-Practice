package com.sapient.coreJava;

public class SingletonRunner {

	public static void main(String[] args) {
		SingletonClass s=SingletonClass.class1();
		SingletonClass s2=SingletonClass.class1();
		System.out.println(s);
		System.out.println(s2);
	}
}
