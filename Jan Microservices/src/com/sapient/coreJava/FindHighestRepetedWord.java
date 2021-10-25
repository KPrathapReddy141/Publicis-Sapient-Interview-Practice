package com.sapient.coreJava;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class FindHighestRepetedWord {

	public static void higRepWord(String str[]) {
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < str.length; i++) {
			if (!map.containsKey(str[i]))
				map.put(str[i], 1);
			else
				map.put(str[i], map.get(str[i]) + 1);
		}
		Entry<String, Integer> entry = map.entrySet().stream().max((a1, a2) -> a1.getValue().compareTo(a2.getValue()))
				.get();
		System.out.println(entry.getKey() + "::" + entry.getValue());
	}

	public static void main(String[] args) {
		String s = "hai how are you and how you are doing";
		String str[] = s.split(" ");
		higRepWord(str);
	}
}
