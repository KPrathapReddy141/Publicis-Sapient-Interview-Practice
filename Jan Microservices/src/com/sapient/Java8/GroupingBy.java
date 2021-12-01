package com.sapient.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class GroupingBy {

	public static void main(String[] args) {

		Map<String, List<String>> map = Arrays.asList("s", "ss","ss").stream().collect(Collectors.groupingBy(s->s, 
				Collectors.toList()));
		System.out.println(map);
	}
}
