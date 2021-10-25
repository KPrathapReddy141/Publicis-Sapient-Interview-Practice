package com.sapient.coreJava;

public class SingletonClass {
	private static SingletonClass SINGLETON_CLASS = null;

	private SingletonClass() {
		System.out.println("hello");
	}

	public static SingletonClass class1() {
		if (SINGLETON_CLASS == null) {
			synchronized (SingletonClass.class) {
				if (SINGLETON_CLASS == null) {
					SINGLETON_CLASS=new SingletonClass();
				}
			}
			
		}
		return SINGLETON_CLASS;
	}
}
