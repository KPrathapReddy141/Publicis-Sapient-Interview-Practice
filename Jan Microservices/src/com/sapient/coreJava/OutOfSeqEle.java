package com.sapient.coreJava;

public class OutOfSeqEle {
	static int capasity = 2;
	static int count = 0;
	static int freq[] = new int[capasity];

	public static int[] outOfSeq(int arr[]) {

		for (int i = 0; i < arr.length - 1; i++) {
			if (capasity == count) {
				expand();
				i--;
			}

			else if (arr[i+1] < arr[i ]) {

				freq[count] = arr[i ];
				count++;
			}
		}

		return freq;
	}

	public static void expand() {
		int expand[] = new int[capasity * 2];
		System.arraycopy(freq, 0, expand, 0, capasity);
		freq = expand;
		capasity = capasity * 2;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 7, 6, 8, 5, 4 };
		arr = outOfSeq(arr);
		for (Integer ar : arr) {
			System.out.println(ar);
		}
	}
}
