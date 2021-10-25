package com.sapient.coreJava;

public class Permitation2 {
	public static void permitations(String s, int l, int r) {
		if (l == r)
			System.out.println(s);
		for (int i = l; i <= r; i++) {
			s = swap(s, l, i);
			System.out.println(l+"::"+i);
			permitations(s, l+1, r);
		}

	}

	public static String swap(String s, int l, int i) {
		char ch[] = s.toCharArray();
		char temp = ch[l];
		ch[l] = ch[i];
		ch[i] = temp;

		return s.valueOf(ch);
	}

	public static void main(String[] args) {
		String s = "123";
		int l = 0;
		int r = s.length() - 1;
		permitations(s, l, r);
	}
}
