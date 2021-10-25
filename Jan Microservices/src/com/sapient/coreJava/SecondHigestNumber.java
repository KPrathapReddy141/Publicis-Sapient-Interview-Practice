package com.sapient.coreJava;

import java.util.Scanner;

public class SecondHigestNumber {
	static Scanner sca = new Scanner(System.in);

	public static int secHigNum(int arr[], int n) {
		for (int i = 0; i < n; i++) {
			arr[i] = sca.nextInt();
		}
		int highest = Integer.MIN_VALUE;
		int secHig = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (highest < arr[i]) {
				secHig = highest;
				highest = arr[i];
			} else if (highest > arr[i] && secHig < arr[i]) {
				secHig = arr[i];
			}
		}
		return secHig;
	}

	public static void main(String[] args) {
		System.out.println("enter size of an Array");
		int n = sca.nextInt();
		int arr[] = new int[n];
		System.out.println(secHigNum(arr, n));
	}
}