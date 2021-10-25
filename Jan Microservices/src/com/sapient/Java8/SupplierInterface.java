package com.sapient.Java8;

import java.util.Random;
import java.util.stream.Stream;

public class SupplierInterface {
	public static void main(String[] args) {
    Stream<Integer> d= Stream.of(new Random().nextInt(10));
    d.forEach(a->System.out.println(a));
		
	}
	
}
