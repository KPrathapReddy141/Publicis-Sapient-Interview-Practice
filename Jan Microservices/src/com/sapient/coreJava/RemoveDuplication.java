package com.sapient.coreJava;

public class RemoveDuplication {

	public static int[] rmvDup(int num[]) {
		int result[] = new int[num.length];
		int val = num[0];
		result[0] = val;
		for (int i = 1; i < num.length; i++) {
			if (val != num[i]) {
				result[i] = num[i];
			}
			val = num[i];
		}
		return result;

	}

	public static void main(String[] args) {
		int num[] = { 1, 2, 3, 4, 4, 4, 5 };
		int arr[] = rmvDup(num);
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}
}
