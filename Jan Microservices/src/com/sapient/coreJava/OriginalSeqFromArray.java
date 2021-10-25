package com.sapient.coreJava;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class OriginalSeqFromArray {
	static Scanner sca = new Scanner(System.in);
	static HashMap<Integer, Integer> map = new HashMap<>();

	public static void orgSqlFromArr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sca.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if (!map.containsKey(arr[i]))
				map.put(arr[i], 1);
			else
				map.put(arr[i], map.get(arr[i]) + 1);
		}
		map.keySet().forEach(System.out::print);
	}

	public static void main(String[] args) {
		 System.out.println("enternum");
		 int n=sca.nextInt();
		int arr[] = new int[n];
		orgSqlFromArr(arr);
	}
}
