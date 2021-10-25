package com.sapient.coreJava;

import java.util.HashMap;

public class RemoveDupication2 {
	public static int[] rmvDup(int val[]) {
		HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
		for (int i = 0; i < val.length; i++) {
			if(!hm.containsKey(val[i])) {
				hm.put(val[i], 1);
			}else {
				hm.put(val[i],hm.get(val[i])+1);
				val[i]=0;
			}
		}
		return val;
	}

	public static void main(String[] args) {
		int val[]= {1,2,1,4,5,6};
		int arr[]=rmvDup(val);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
