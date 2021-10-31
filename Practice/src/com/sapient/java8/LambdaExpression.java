package com.sapient.java8;

public class LambdaExpression {

	// ()->{};
	// it is syntax of lambda expressions
	public static void main(String[] args) {
		lambda la=(n,m1)->m1+n;
		System.out.println(la.method(3, 3));
	}

}
interface lambda{
	int method(int a,int b);
}
