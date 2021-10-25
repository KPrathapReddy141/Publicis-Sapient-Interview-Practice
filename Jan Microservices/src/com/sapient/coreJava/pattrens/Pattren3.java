package com.sapient.coreJava.pattrens;

public class Pattren3 {

	public static void main(String[] args) {
		int k =5;
		int p=1;
		for (int i = 1; i <=k; i++) {
			if (i % 2 != 0) {
				System.out.print(" ");

				if(i==1) {
				for (int j = 1; j <=k; j++) {
					System.out.print("*");
				}
				}
				else {
				for (int j = 1; j <=k; j++) {
					if(j==p+1 || j==k-p ) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				p++;
				}
				System.out.println(" ");

			}
			else {
				System.out.println(" ");
			}
			
		}
	}
}
