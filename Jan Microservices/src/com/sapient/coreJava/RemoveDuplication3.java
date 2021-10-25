package com.sapient.coreJava;

import java.util.Iterator;

public class RemoveDuplication3 {

	public static int[] remDup(int arr[]) {
		int result[]=new int[arr.length];
		int num=arr[0];
		result[0]=num;
		for (int i = 1; i < arr.length; i++) {
			if(num!=arr[i])
				result[i]=arr[i];
			num=arr[i];
		}
		return result;
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,5,6,6};
		arr=remDup(arr);
		for(Integer res:arr) System.out.print(res);
	}
}
