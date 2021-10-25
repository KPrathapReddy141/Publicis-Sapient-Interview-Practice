package com.sapient.coreJava.collections;

import java.util.HashMap;
import java.util.Map;

public class HashSet{
	Map<String, Object> map = null;
	public static final Object PRESENT = new Object();

	public HashSet(){
		map=new HashMap<String, Object>();
	}


	public boolean add(String s) {
		return map.put(s,PRESENT )==null;
	}
	public boolean add(String s) {
		return map.put(s,PRESENT )==null;
	}
	public boolean remove(String s) {
		return map.put(s,PRESENT )==PRESENT;
	}
}
