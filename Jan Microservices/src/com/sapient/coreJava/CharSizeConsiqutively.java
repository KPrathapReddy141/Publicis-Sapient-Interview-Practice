package com.sapient.coreJava;

public class CharSizeConsiqutively {
	public static void main(String[] args) {
		String s = "prrrqqpqwqssspp";
		char ch[] = s.toCharArray();
		char c = Character.MIN_VALUE;
		int count = 1;
		int k=0;
		for (int i = 0; i < ch.length; i++) {
			if (ch.length >= 3) {
				if (c == ch[i]) {
					count++;
					k=i;
				} else {
					if (count >= 3) {
						System.out.println("count:"+count);
						for (int j = i - 1; j >= i-count; j--) {
							System.out.print(ch[j]);
							ch[j] = ' ';
						}
						System.out.println();
						ch = String.valueOf(ch).replace(" ", "").toCharArray();
						
						i = 0;
					}
					c = ch[i];
					count=1;
				}
			}
		}
		if (count >= 3) {
			System.out.println("count:"+count);
			for (int j = k ; j > k-count; j--) {
				System.out.print(ch[j]);
				ch[j] = ' ';
			}
			System.out.println();
			ch = String.valueOf(ch).replace(" ", "").toCharArray();
			
		}
		
		System.out.println("---------------");
		System.out.print("Final OutPut::");
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}

	}

	/*public static void main1(String[] args) {
		String s = "aaabbccd";
		char ch = s.charAt(0);
		int count = 1;
		for (int i = 1; i < s.length(); i++) {
			if (ch == s.charAt(i)) {
				count++;
			} else {
				System.out.print(ch + String.valueOf(count) + " ");
				ch = s.charAt(i);
				count = 1;
			}
		}
		System.out.print(ch + String.valueOf(count));
	}*/
}
