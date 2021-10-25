package com.sapient.coreJava;

public class MergeSort {
	public static void mergeSort(int arr[], int p, int r) {
		if (p < r) {
			int q = (p + r) / 2;
			mergeSort(arr, p, q);
			mergeSort(arr, q + 1, r);
			merge(arr, p, q, r);
		}

	}

	public static void merge(int arr[], int p, int q, int r) {
		int n1 = q - p + 1;
		int n2 = r - q;
		int la[] = new int[n1];
		int ra[] = new int[n2];
		for (int i = 0; i < n1; i++) {
			la[i] = arr[p + i];
		}
		for (int i = 0; i < n2; i++) {
			ra[i] = arr[q + i + 1];
		}
		int i = 0;
		int j = 0;
		int k = p;
		while (i < n1 && j < n2) {
			if (la[i] <= ra[j]) {
				arr[k] = la[i];
				i++;
			} else {
				arr[k] = ra[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			arr[k] = la[i];
			i++;
			k++;
		}
		while (j < n2) {
			arr[k] = ra[j];
			j++;
			k++;
		}

	}

	public static void main(String[] args) {
		int arr[] = { 7, 4, 2, 8, 5, 0, 1 };
		mergeSort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
