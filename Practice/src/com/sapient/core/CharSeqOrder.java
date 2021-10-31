package com.sapient.core;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharSeqOrder {

	public static void charSeq(String s) {
		Map<Character, Integer> map=new LinkedHashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if(!map.containsKey(s.charAt(i)))
				map.put(s.charAt(i), 1);
			else map.put(s.charAt(i), map.get(s.charAt(i))+1);
				
		}
		System.out.println(map);
		
	}
	public static void main(String[] args) {
		String s="persistance";
		charSeq(s);
	}
}
