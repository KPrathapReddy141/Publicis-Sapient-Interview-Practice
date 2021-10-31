package com.sapient.coreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

public class ClassB {
	int a = 20;
	int b = 20;
	static int c;

	boolean Object(Boolean ob) {
		return ob;
	}

	public static int sup(int a, int b) {

		return a + b;
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		int a = list.stream().reduce(new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer t, Integer u) {
				return t + u;
			}
		}).get();
		System.out.println(a);
		BinaryOperator<Integer> supp = ClassB::sup;
		int num = 0;
		for (Integer ls : list)
			num = num + supp.apply(ls, ls);
		System.out.println(num / 2);
	}

}
