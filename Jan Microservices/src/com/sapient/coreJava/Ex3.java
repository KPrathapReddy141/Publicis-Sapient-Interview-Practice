package com.sapient.coreJava;

public class Ex3 {

	public static void main(String[] args) {
		String s = "hello";
		int num = 2;
		int count = 1;
		for (int i = 0; i < num; i++) {
			System.out.print(s.charAt(s.length() - count));
			count++;
		}
		for (int i = 0; i < s.length() - num; i++) {
			System.out.print(s.charAt(i));
		}
	}
}
