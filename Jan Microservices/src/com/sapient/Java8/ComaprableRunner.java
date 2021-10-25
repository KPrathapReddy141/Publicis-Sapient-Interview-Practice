package com.sapient.Java8;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class ComaprableRunner {
	public static void main(String[] args) {
		Map<ComparableExample, Integer> map = new TreeMap<ComparableExample, Integer>();
		ComparableExample cmb = new ComparableExample("hey", 4444l, "Mtech");
		ComparableExample cmb2 = new ComparableExample("ae", 3444l, "Btech");
		map.put(cmb, 1);
		map.put(cmb2, 2);
		Set<Entry<ComparableExample, Integer>> map2 = map.entrySet();
		for (Entry<ComparableExample, Integer> list2 : map2) {
			System.out.println(list2.getKey().qual);
		}
	}
}
