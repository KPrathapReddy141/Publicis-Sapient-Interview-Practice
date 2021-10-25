package com.sapient.coreJava.pattrens;

public class Pattren1 {

	public static void main(String []args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for (int j =i; j <=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		int k=1;
		for (int i = 2; i<=5; i++) {
			for (int j =i ; j <5; j++) {
				System.out.print(" ");
			}
			for (int j = i-k; j <=i; j++) {
				System.out.print("*");
			}
			k++;
			System.out.println();
		}
	}
}
