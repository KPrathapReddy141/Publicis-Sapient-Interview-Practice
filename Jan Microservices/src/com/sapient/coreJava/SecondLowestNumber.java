package com.sapient.coreJava;

public class SecondLowestNumber {
	public static int secLarNum(int arr[]) {
		if (arr.length < 2) {
			return 0;
		}
		int fstHig = Integer.MAX_VALUE;
		int secHig = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (fstHig > arr[i]) {
				secHig = fstHig;
				fstHig = arr[i];
			} else if (fstHig < arr[i] && secHig > arr[i]) {
				secHig = arr[i];
			}
		}
		if (secHig == Integer.MAX_VALUE) {
			System.out.println("No second lowest Num");
			return 0;
		}
		return secHig;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 1, 1, 2 };
		System.out.println(secLarNum(arr));
	}
}
