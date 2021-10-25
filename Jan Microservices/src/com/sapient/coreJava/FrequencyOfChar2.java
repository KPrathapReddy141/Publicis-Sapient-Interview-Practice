package com.sapient.coreJava;

public class FrequencyOfChar2 {

	public static void freqOfChar(String s) {
		// int count = 0;
		int freq[] = new int[26];
		for (int i = 0; i < s.length(); i++) {
			freq[s.charAt(i) - 'a']++;
		}
		for (int i = 0; i < s.length(); i++) {
			if (freq[s.charAt(i) - 'a'] > 1) {
//				if (count == 2)
//					break;
				System.out.print(s.charAt(i));
				System.out.print(freq[s.charAt(i) - 'a'] + " ");
				freq[s.charAt(i) - 'a'] = 0;

				// count++;
			}
		}
	}

	public static void main(String[] args) {
		String str = "saiprathapreddy";
		freqOfChar(str);
	}
}
