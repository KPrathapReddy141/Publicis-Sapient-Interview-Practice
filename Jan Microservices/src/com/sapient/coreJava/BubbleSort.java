package com.sapient.coreJava;

public class BubbleSort {
	public static int[] bubbleSort(int arr[]) {
		int temp;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] >= arr[j + 1]) {
					temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int arr[] = { 3, 2, 7, 1, 5, 4 };
		arr = bubbleSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
