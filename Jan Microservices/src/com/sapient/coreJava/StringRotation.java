package com.sapient.coreJava;

public class StringRotation {

	public static void main(String[] args) {
		String s = "XYZ";
		String s2 = "ZYX";

		int j = 1;
		if (s.length() == s2.length()) {
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == s2.charAt(s2.length() - j)) {
					j++;

				}

			}
			if (j - 1 == s.length()) {
				System.out.println(true);
			}
		} else
			System.out.println(false);
	}
}
