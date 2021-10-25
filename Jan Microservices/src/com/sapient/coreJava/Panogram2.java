package com.sapient.coreJava;

public class Panogram2 {
	public static boolean pangogram(String s) {
		boolean pan[] = new boolean[26];
		int index = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 65 && s.charAt(i) <= 91) {
				index = s.charAt(i) - 65;
				pan[index] = true;
			} else if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
				index = s.charAt(i) - 97;
				pan[index] = true;
			}
		}
		for (int i = 0; i < pan.length; i++) {
			if (pan[i] == false)
				return false;

		}

		return true;
	}

	public static void main(String[] args) {

		String s = "ab cdefqwertyuiopl";
		boolean b = pangogram(s);
		if (b) {
			System.out.println("panogram");
		} else {
			System.out.println("not panogram");
		}
	}
}
