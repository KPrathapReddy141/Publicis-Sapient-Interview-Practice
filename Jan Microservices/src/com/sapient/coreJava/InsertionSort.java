package com.sapient.coreJava;

public class InsertionSort {

	public static int[] sort(int arr[]) {
		int key;
		int j;
		int n=arr.length;
		for (int i = 1; i <n; i++) {
			key = arr[i];
			j = i - 1;
			while (j >= 0 && key <= arr[j]) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
		return arr;
	}

	public static void main(String[] args) {
		int arr[] = { 3, 41, 1, 5, 8, 9 };
		 arr= sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
