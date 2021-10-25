package com.sapient.coreJava;

public class Ex {
	final int x;
	{
		x=30;
	}
	public static boolean sameOrNot(int arr1[], int arr2[]) {
		boolean b = false;
		if (arr1.length == arr2.length) {
			int k = 0;
			for (int i = 0; i < arr1.length; i++) {
				for (int j = 0; j < arr2.length; j++) {
					if (arr1[i] == arr2[j]) {
						k++;
					}
				}
			}
			if (arr1.length == k) {
				b = true;
			}
		}
		return b;
	}

	public static void main(String[] args) {
		int arr1[] = { 10, 20, 30 };
		int arr2[] = { 30, 10, 20 };
		System.out.println(sameOrNot(arr1, arr2));
		System.out.println(new Ex().x);
		
		
	}
}

