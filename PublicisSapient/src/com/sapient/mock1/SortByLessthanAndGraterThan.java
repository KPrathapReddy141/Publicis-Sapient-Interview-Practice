package com.sapient.mock1;

import java.util.Arrays;

public class SortByLessthanAndGraterThan {
//arr[0]<arr[1],arr[1]>arr[2],arr[2]<arr[3],..........
	public static void sortedIndex(int arr[]) {

		for (int i = 0; i < arr.length - 1; i++) {
			int temp;
			if (i % 2 == 0) {
				if (arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			} else {
				if (arr[i] < arr[i + 1]) {
					temp = arr[i + 1];
					arr[i + 1] = arr[i];
					arr[i] = temp;
				}
			}

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}

	}

	public static void main(String[] args) {
		int arr[] = { 3, 2, 4, 1, 5 };
		sortedIndex(arr);
	}
}
