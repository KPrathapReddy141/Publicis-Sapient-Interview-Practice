package com.sapient.Java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee2Runner {

	public static void main(String[] args) {
		List<Employee2> list = new ArrayList<Employee2>();
		Stream<String> st = null;
		try {
			st = Files.lines(Paths.get("C:\\Users\\saikambh\\Documents\\sapient.txt.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		st.map((s) -> {
			String str[] = s.split(",");
			Employee2 emp = new Employee2();
			emp.setId(Integer.parseInt(str[0]));
			emp.setName(str[1]);
			emp.setPhone(Long.parseLong(str[2]));
			emp.setWorkLocation(str[3]);
			emp.setGender(str[4]);
			emp.setpAdd(str[5]);
			emp.setjDate(str[6]);
			emp.setAge(Integer.parseInt(str[7]));
			list.add(emp);
			return s;
		}).count();
		list.parallelStream().filter(s -> !s.getGender().equals("male"))
				.collect(Collectors.groupingBy(s -> s.getGender()))
				.forEach((s2, s3) -> {
					System.out.println(s2);
					System.out.println("===============");
					s3.forEach(a -> System.out.println(a.getName()));
					System.out.println("==============");
				});
		Double d = list.parallelStream().collect(Collectors.averagingInt(s -> s.getAge()));
		System.out.println(d);
		System.out.println("-===========");
		list.stream().filter((p) -> {
			return p.getAge() > 23;
		}).collect(Collectors.groupingBy(p -> p.getAge())).forEach((s, k) -> {
			System.out.println(s);
			k.forEach(f -> System.out.println(f.getName()));

		});
		System.out.println("============");
		
		list.parallelStream().collect(Collectors.groupingBy(emp->emp.getName(),Collectors.maxBy(
				(m1,m2)->m1.getAge().compareTo(m2.getAge())))).forEach
		((f1,f2)->System.out.println(f1+".."+f2.get().getAge()));
		
		Optional<Employee2> emp=list.parallelStream().collect(Collectors.maxBy((s1,s2)->s1.getAge().compareTo(s2.getAge())));
		if(emp.isPresent()) {
			Employee2 emp2=emp.get();
			System.out.println(emp2.getName());
			
		}
	}
}
