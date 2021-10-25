package com.sapient.coreJava;

public class FirstNonRepetedElement {
	public static char FirNonRep(String str) {
		char cha = 0;
		String s = str.toLowerCase();
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int k = 0;
			for (int j = 0; j < ch.length; j++) {
				if (i != j && ch[i] != ch[j]) {
					k++;
				}
			}
			if (k + 1 == ch.length) {
				cha = ch[i];
				break;
			}
		}
		return cha;
	}

	public static void main(String[] args) {
		String s = "HhloWowld";
		char c = FirNonRep(s);
		System.out.println(c);
	}
}
