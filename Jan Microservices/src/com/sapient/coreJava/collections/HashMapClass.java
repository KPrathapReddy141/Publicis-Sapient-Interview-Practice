package com.sapient.coreJava.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapClass {
	 HashMap<Integer,String>map;

	HashMapClass(HashMap<Integer, String> map) {
		this.map = map;
	}

	synchronized void m1(int i, String s) {

		if (!map.containsKey(i)) {
			map.put(i, s);
			System.out.println(Thread.currentThread().getName());
		} else {
			System.out.println(Thread.currentThread().getName());
		}
	}

}
