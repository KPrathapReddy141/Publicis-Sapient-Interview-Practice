package com.sapient.coreJava;

public class FrequencyOfACharacter {
	public static void removingDup(String s) {
		s = s.toLowerCase();
		int freq[] = new int[26];
		for (int i = 0; i < s.length(); i++) {
			freq[s.charAt(i) - 'a']++;
		}
		for (int i = 0; i < s.length(); i++) {
			if (freq[s.charAt(i) - 'a'] ==1) {
				System.out.print(s.charAt(i));
				System.out.print(freq[s.charAt(i) - 'a'] + " ");
				freq[s.charAt(i)-'a']=0;
			}
		}
	}
	
	public static void main(String[] args) {
		String s = "saiPrathapReddy";
		removingDup(s);
	}
}
