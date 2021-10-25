package com.sapient.coreJava;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = { 23, 33, 44, 55, 77, 88, 99 };
		int s = 0;
		int e = arr.length - 1;
		int mid = (s + e) / 2;
		int key = 77;
		while (s <= e) {
			if (arr[mid] < key) {
				s = mid + 1;

			} else if (arr[mid] == key) {
				System.out.println(mid);
				break;
			} else {
				e = mid - 1;
			}
			mid = (s + e) / 2;

		}
		if (s > e) {
			System.out.println("not found");
		}
	}
}
