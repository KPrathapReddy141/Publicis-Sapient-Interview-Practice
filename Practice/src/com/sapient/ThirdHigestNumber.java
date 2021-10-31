package com.sapient;

public class ThirdHigestNumber {
	public static int theHigNum(int arr[]) {
		int first=Integer.MIN_VALUE;
		int sec=Integer.MAX_VALUE;
		int th=Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(first<arr[i]) {
				th=sec;
				sec=first;
				first=arr[i];
			}
			else if(first>arr[i] && sec<arr[i]) {
				th=sec;
				sec=arr[i];
			}
			else if(sec>arr[i] && th<arr[i]) {
				th=arr[i];
			}
		}
		return sec;
	}

	public static void main(String[] args) {
		int arr[]= {6,6,5,6,6,5};
		System.out.println(theHigNum(arr));
	}
}
