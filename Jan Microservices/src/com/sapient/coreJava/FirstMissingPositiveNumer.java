package com.sapient.coreJava;

import java.util.Arrays;

public class FirstMissingPositiveNumer {
	public static int fMPN(int arr[]) {
		int n=Integer.MIN_VALUE;
		int pos[];
		int num=0;
		for (int i = 0; i < arr.length; i++) {
			if(n<=arr[i])
				n=arr[i];
			
		}
		pos=new int[n+1];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>=0) {
				pos[arr[i]]=arr[i];
			}
		}
		for (int i = 0; i < pos.length; i++) {
			if(num!=pos[i])
				return num;
			num++;
		}
		return num;
	}

	public static void main(String[] args) {
		int arr[]= {3,2,1,-4,-5,7,5,4,6};
		Arrays.sort(arr);
		System.out.println(fMPN(arr));
	}
}
