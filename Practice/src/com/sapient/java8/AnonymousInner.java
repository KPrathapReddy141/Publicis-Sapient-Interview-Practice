package com.sapient.java8;

public class AnonymousInner {
	 

	public static  Object lambda() {
		int s = 70;
		test2 t2=new test2(){
			
			public int s2(int n) {
				//hear s we can't modify coz it is considers as a effectively final variable in anonymous inner clases
				//s=79;
				return n;
			}
			
			@Override
			public void s3(String s) {
				
			}
			
		};
		
		return t2.s2(2);
	}

	public static void main(String[] args) {
		System.out.println(lambda());

	}
}

interface test2 {

	public int s2(int n);

	// lambda expression only applicable functional interfaces
	public void s3(String s);
}
