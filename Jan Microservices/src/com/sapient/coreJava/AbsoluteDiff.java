package com.sapient.coreJava;

import java.util.Arrays;

public class AbsoluteDiff {

	public static void main(String[] args) {
		int arr[]= {3,2,5,6,1,7};
		Arrays.sort(arr);
		int diff=0;
		for (int i = 0; i <arr.length-1 ; i++) {
			diff=diff+(arr[i+1]-arr[i]);
		}
		System.out.println(diff);
	}
}
