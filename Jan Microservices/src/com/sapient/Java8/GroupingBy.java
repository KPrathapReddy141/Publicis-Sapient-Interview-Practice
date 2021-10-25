package com.sapient.Java8;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
public class GroupingBy {

	public static void main(String[] args) {

		Map<Character, Long> map = Arrays.asList('s', 's').stream().collect(Collectors.groupingBy(s->s, 
				Collectors.counting()));
		System.out.println(map);
	}
}
