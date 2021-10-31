package com.sapient.mock1;

public class TestClass {
	public static void fstNonDupChar(String s) {
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int temp = 0;
			for (int j = 0; j < ch.length; j++) {
				if (i != j && ch[i] != ch[j]) {
					temp++;
				}
			}
			if (temp + 1 == ch.length) {
				System.out.println(ch[i]);
				break;
			}
		}
	}

	public static void main(String[] args) {
		String s = "apple";
		fstNonDupChar(s);
	}
}
