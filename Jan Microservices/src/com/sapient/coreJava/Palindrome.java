package com.sapient.coreJava;

public class Palindrome {
	public static int palin(int num) {
		int rev = 0;
		int catc;
		while (num != 0) {
			catc = num % 10;
			rev = rev + catc;
			if (num > 10) {
				rev = rev * 10;
			}
			num = num / 10;
		}
		return rev;
	}

	public static void main(String[] args) {
		int num = 12321;
		int num2 = palin(num);
		if (num == num2)
			System.out.println(true);
	}
}
