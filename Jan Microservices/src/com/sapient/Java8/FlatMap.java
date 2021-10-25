package com.sapient.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {

	public static void main(String[] args) {
		List<Integer> list = Stream.of(Arrays.asList(1, 2, 3, 4, 5, 6), Arrays.asList(0, 9, 87))
				.flatMap(s -> s.stream()).collect(Collectors.toList());
		System.out.println(list);
	}
}
