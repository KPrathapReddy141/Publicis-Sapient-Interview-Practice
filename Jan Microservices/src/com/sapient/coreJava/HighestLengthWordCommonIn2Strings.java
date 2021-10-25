package com.sapient.coreJava;

public class HighestLengthWordCommonIn2Strings {
	public static String higLegWord(String s, String s2) {
		String str[] = s.split(" ");
		String str2[] = s2.split(" ");
		String temp = "";
		String temp2 = null;
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str2.length; j++) {
				if (str[i].equals(str2[j])) {
					temp = temp + str[i] + " ";
				}
			}
		}
		String str3[] = temp.split(" ");
		int n = Integer.MIN_VALUE;
		if (str3 != null) {
			for (int j = 0; j < str3.length; j++) {
				if (n < str3[j].length()) {
					n = str3[j].length();
					temp2 = str3[j];
				}
			}
		}

		return temp2;
	}

	public static void main(String[] args) {
		String s = "Hai Hello Java";
		String s2 = "Hai Hello Python";
		System.out.println(higLegWord(s, s2));
	}
}
