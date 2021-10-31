package com.sapient.core;

import java.util.Iterator;

public class FrequencyOfString {
public static void frequncy(String s) {
	int arr[]=new int[26];
	for (int i = 0; i < s.length(); i++) {
		arr[s.charAt(i)-'a']++;
	}
	for (int i = 0; i < s.length(); i++) {
		if(arr[s.charAt(i)-'a']<=1) {
			System.out.print(s.charAt(i));
			System.out.print(arr[s.charAt(i)-'a']);
			arr[s.charAt(i)-'a']=0;
			break;
		}
	}
}
	public static void main(String[] args) {
		String s="saiprathapreddy";
		frequncy(s);
	}
}
