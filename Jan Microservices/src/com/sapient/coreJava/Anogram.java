package com.sapient.coreJava;

import java.util.Arrays;

public class Anogram {
	public static boolean anogram(String str,String str2) {
		char ch[] = str.toCharArray();
		char ch2[] = str2.toCharArray();
		boolean b = false;
		if (ch.length == ch2.length) {
			Arrays.sort(ch);
			Arrays.sort(ch2);
			b = Arrays.equals(ch, ch2);
			return b;
		}
		return b;
	}
	public static void main(String[] args) {
		String s = "XYZ";
		String s2 = "ZYX";
		boolean b=anogram(s, s2);
		if (b) {
			System.out.println("Anogram");
		} else {
			System.out.println("notAnogram");
		}

	}
}
