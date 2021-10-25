package com.sapient.Java8;

import java.util.HashMap;
import java.util.Map;

public class ComparableExample implements Comparable<ComparableExample> {
	public String name;
	public Long phone;
	public String qual;

	@Override
	public int compareTo(ComparableExample o) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Mtech", 18);
		map.put("Btech", 16);
		return map.get(this.qual).compareTo(map.get(o.qual));
	}

	public ComparableExample(String name, Long phone, String qual) {
		this.name = name;
		this.phone = phone;
		this.qual = qual;
	}

}
