package com.sapient.coreJava;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MaximumOcuuraingCharachter {

	public static char maxOccChar(String s) {
		String s2=s.toLowerCase().replace(" ", "");
		char ch[]=s2.toCharArray();
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		for (int i = 0; i < ch.length; i++) {
			if(!hm.containsKey(ch[i])) {
				hm.put(ch[i], 1);
			}
			else {
				hm.put(ch[i], hm.get(ch[i])+1);
			}
		}
		Collection<Integer> in=hm.values();
		Object obj[] =in.toArray();
		Integer i=Integer.MIN_VALUE;
		for(Object ob:obj) {
			if(i<(Integer)ob) {
				i=(Integer)ob;
			}
		}
		char c = 0;
		Set<Entry<Character, Integer>> map=hm.entrySet();
		for(Entry<Character, Integer> m: map) {
			if(m.getValue()==i) {
				c=m.getKey();
				break;
			}
		}
		return c;
		
	}
	public static void main(String[] args) {
		String s="prathaprr Redddddy";
		
		char c=maxOccChar(s);
		System.out.println(c);
	}
}
