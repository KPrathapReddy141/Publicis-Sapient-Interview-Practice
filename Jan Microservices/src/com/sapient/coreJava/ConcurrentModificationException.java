package com.sapient.coreJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ConcurrentModificationException {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 1);
		map.put(2, 1);
		map.put(3, 1);
		Set<Entry<Integer, Integer>> itr = map.entrySet();
		Iterator<Entry<Integer, Integer>> itr2 = itr.iterator();
		while (itr2.hasNext()) {
			Entry<Integer, Integer> con = itr2.next();
			if (map.containsKey(1)) {
				System.out.println(con.getKey());
				itr2.remove();
			}
		}
		System.out.println(map);
	}
}
