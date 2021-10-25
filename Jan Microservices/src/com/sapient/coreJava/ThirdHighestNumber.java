package com.sapient.coreJava;

import java.util.Scanner;

public class ThirdHighestNumber {
	static Scanner sca = new Scanner(System.in);

	public static int theHigNum(int arr[], int n) {
		for (int i = 0; i < n; i++) {
			arr[i] = sca.nextInt();
		}
		int highest = Integer.MIN_VALUE;
		int secHig = Integer.MIN_VALUE;
		int theHig = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (highest < arr[i]) {
				theHig = secHig;
				secHig = highest;
				highest = arr[i];
			} else if (highest > arr[i] && secHig < arr[i]) {
				theHig = secHig;
				secHig = arr[i];

			} else if (secHig > arr[i] && theHig < arr[i]) {
				theHig = arr[i];
			}
		}
		return theHig;
	}

	public static void main(String[] args) {
		System.out.println("enter size of an Array");
		int n = sca.nextInt();
		int arr[] = new int[n];
		System.out.println(theHigNum(arr, n));
	}

}
