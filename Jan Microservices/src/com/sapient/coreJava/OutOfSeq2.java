package com.sapient.coreJava;

public class OutOfSeq2 {
	public static void outOfSeq(int arr[]) {
		boolean b = true;
		int num = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] < arr[i + 1] && arr[i] + 1 == arr[i + 1]) {
				b = true;
			} else {
				b = false;
				num = i + 1;
				break;
			}
		}
		if (b) {
			System.out.println("Array is in correct Order");
		} else
			System.out.println("out of seq at index:" + num);

	}

	public static void main(String[] args) {
		int arr[] = { 2, 1, 3, 4, 5 };
		outOfSeq(arr);
	}

	public static void main1(String[] args) {
		int arr[] = { 5, 4, 3, 1, 2 };
		outOfSeq(arr);
	}
}
