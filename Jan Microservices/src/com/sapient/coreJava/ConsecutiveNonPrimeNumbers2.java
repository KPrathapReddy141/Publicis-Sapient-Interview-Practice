package com.sapient.coreJava;

public class ConsecutiveNonPrimeNumbers2 {

	public static void main(String[] args) {
		int count = 0;
		int arr[] = new int[5];
		for (int i = 2; i < 30; i++) {
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					if (count != arr.length) {
						if (count == 0) {
							arr[count] = i;
							count++;
						} else if (arr[count - 1] + 1 == i) {
							arr[count] = i;
							count++;
						} else {
							count = 0;
							i--;
						}
					}
					break;
				}
			}
		}
		for (Integer array : arr) {
			System.out.println(array);
		}
	}
}
