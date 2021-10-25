package com.sapient.coreJava;

public class BalencingElement {
	public static void balEle(int arr[]) {
		int j = 0, p = 0, n = 0, k = 0;

		int num[] = new int[arr.length - 1];
		while (j < arr.length) {
			for (int i = 0; i < arr.length; i++) {
				if (i != j) {
					num[k] = arr[i];
					k++;
				}

			}
			for (int i = 0; i < num.length; i++) {
				if (i % 2 == 0) {
					p = p + num[i];
				} else {
					n = n + num[i];
				}

			}
			if (p == n) {
				System.out.println(arr[j]);
			}
			k = 0;
			p = 0;
			n = 0;

			j++;

		}

	}

	public static void main(String[] args) {
		int arr[] = { 5, 5, 2, 5, 5 };
		balEle(arr);
	}
}
