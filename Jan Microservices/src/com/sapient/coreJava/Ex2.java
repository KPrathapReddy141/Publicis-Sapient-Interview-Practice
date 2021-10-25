package com.sapient.coreJava;

import java.util.HashMap;

public class Ex2 {
	public static int getNum(int arr[], int num) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int twice_increase = 0;
		for (int i = 0; i < arr.length; i++) {
			if (!hm.containsKey(arr[i])) {
				hm.put(arr[i], 1);
			} else {
				hm.put(arr[i], hm.get(arr[i]) + 1);
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (hm.get(num - arr[i]) != null) {
				twice_increase = twice_increase + hm.get(num - arr[i]);
			}
		}
		return twice_increase / 2;
	}

	public static void main(String[] args) {
		int arr[] = { 5, 1, 7, -1, 5, 8, 4 };
		int num = 6;
		System.out.println(getNum(arr, num));
	}
}
