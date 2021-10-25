package com.sapient.coreJava;

public class Permitations {
	public static void permute(String s, int l, int r) {
		if(l==r) {
			System.out.println(s);
		}
		for (int i = l; i < s.length(); i++) {
			s=swap(s, l, i);
			permute(s, l + 1, r);

		}

	}

	public static String swap(String s, int l, int i) {
		char temp;
		char ch[] = s.toCharArray();
		temp = ch[l];
		ch[l] = ch[i];
		ch[i] = temp;
		return String.valueOf(ch);
	}

	public static void main(String[] args) {
		String s = "123";
		int l = 0;
		int r = s.length() - 1;
		permute(s, l, r);
	}
}
