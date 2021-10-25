package com.sapient.coreJava;

public class MultipleOccuranceOfString {

	public static void main(String[] args) {
		String s = "accbbbbbc";
		char ch[] = s.toCharArray();
		for (int i = 1; i < ch.length - 1; i++) {
			int count = 0;
			if (ch.length >= 3) {
				if (ch[i - 1] == ch[i] && ch[i] == ch[i + 1]) {
					ch[i - 1] = ' ';
					ch[i] = ' ';
					ch[i + 1] = ' ';
					count++;
					if (count != 0) {
						ch = String.valueOf(ch).replace(" ", "").toCharArray();
						i = 0;
					}
				}
			}
		}
		s = String.valueOf(ch);
		System.out.println(s);
	}
}
