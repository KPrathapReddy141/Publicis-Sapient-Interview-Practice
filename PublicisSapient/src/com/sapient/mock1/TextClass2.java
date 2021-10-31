package com.sapient.mock1;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;

public class TextClass2 {
	static LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

	public static char firHigAppChar(String s) {
		char c = ' ';
		s = s.toLowerCase().replace(" ", "");
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (!map.containsKey(ch[i])) {
				map.put(ch[i], 1);
			} else {
				map.put(ch[i], map.get(ch[i]) + 1);
			}
		}
		Collection<Integer> val = map.values();
		Object obj[] = val.toArray();
		int high = Integer.MIN_VALUE;
		for (Object ob : obj) {
			if (high <= (Integer) ob) {
				high = (Integer) ob;
			}
		}
		Set<Entry<Character, Integer>> set = map.entrySet();
		for (Entry<Character, Integer> entry : set) {
			if (entry.getValue() == high) {
				System.out.print(entry.getValue());
				c = entry.getKey();
				break;
			}
		}
		return c;
	}

	public static void main(String[] args) {
		String s = "hellol hai ";
		char c = firHigAppChar(s);
		System.out.println(c);
	}
}
