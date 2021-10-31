package com.sapient.coreJava;

public class Runner  {

	public static void main(String[] args) {
		ClassB cb=new ClassB();
		cb.a=11;
		cb.b=31;
		cb.c=4;
		ClassB cb2=new ClassB();
		
		cb2.a=20;
		cb2.b=30;
		cb2.c=10;
		
		System.out.println(cb2.a);
		System.out.println(cb.a);
		System.out.println(cb2.c);
		System.out.println(cb.c);
	}

	

	

	 
}
