package com.sapient.coreJava;

public class RemoveDuplicationWithOriginalChar {
	public static void returnDupChar(String s) {
		String str = s.replace(" ", "");
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int i1 = 0;
			for (int j = i; j < ch.length; j++) {
				if (i != j && ch[i] == ch[j]) {
					// if (i1 < 1) {
					// System.out.println(ch[i]);
					i1++;
					// }
					ch[j] = ' ';

					// String s2 = String.valueOf(ch).replace(" ", "");
					// ch = s2.toCharArray();
					// j--;

				}
				if (i1 >= 1 && j == ch.length - 1) {
					ch[i] = ' ';
				}

			}
		}
		ch = String.valueOf(ch).replaceAll(" ", "").toCharArray();
		for (char c : ch) {
			System.out.print(c);
		}
	}

	public static void main(String[] args) {
		String s = "javaaa and javascriptj";
		returnDupChar(s);
	}
}
