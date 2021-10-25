package com.sapient.coreJava.pattrens;

public class Pattren2 {
public static void main(String[] args) {
	int k=65;
	for (int i = 1; i <=4; i++) {
		for(int j=i;j<4;j++) {
			System.out.print(" ");
		}
		for (int j = 1; j <=i; j++) {
			System.out.print((char)k+" ");
			k++;
		}
		System.out.println();
	}
	int p=70;
	for (int i = 1; i <=3; i++) {
		for(int j=i;j>0;j--) {
			System.out.print(" ");
		}
		for (int j =i; j <=3; j++) {
			System.out.print((char)p+" ");
			p--;
		}
		System.out.println();
	}
}
}
