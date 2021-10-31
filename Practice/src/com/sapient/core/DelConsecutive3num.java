package com.sapient.core;

public class DelConsecutive3num {
	public static void delCon(String s) {
		char ch[] = s.toCharArray();
		char c = Character.MIN_VALUE;
		int count = 1;
		int r= 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch.length >= 3) {
				if (c == ch[i]) {
					count++;
					r = i;
				} else {
					if (count >= 3) {
						for (int j = i - 1; j >= i - count; j--) {
							ch[j] = ' ';
						}
						ch = String.valueOf(ch).replace(" ", "").toCharArray();
						i = 0;
					}
					count = 1;
					c = ch[i];
				}
			}
		}
		if (count >= 3) {
			for (int i = r; i > r - count; i--) {
				ch[i] = ' ';
			}
			ch = String.valueOf(ch).replace(" ", "").toCharArray();
		}
		System.out.print("Final OutPut::");
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
	}

	public static void main(String[] args) {
		String s = "pqqqsssppqqqs";
		delCon(s);
	}
}
