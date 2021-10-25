package com.sapient.coreJava.pattrens;

import java.util.Iterator;

public class PattrenPractice {
	public static void main(String[] args) {
		int k = 7;
		int s=1;
		int q=k;
		for (int i = 1; i <=k; i++) {
			if (i % 2 != 0 && i==1) {
				for (int j = 1; j <=k; j++) {
					System.out.print("*");
				}
				s++;
				q--;
				System.out.println();
			}
			else if(i % 2 != 0 ) {
				for (int j = 1; j <=k; j++) {
					if(j==s||j==q)System.out.print("*");
					else System.out.print(" ");
				}
				s++;
				q--;
               System.out.println();
			}
		}
	}
}
