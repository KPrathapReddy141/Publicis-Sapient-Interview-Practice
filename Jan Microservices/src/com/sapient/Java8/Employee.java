package com.sapient.Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Employee {
	private Integer id;
	private String name;
	private Integer age;
	static List<Employee> list = new ArrayList<Employee>();

	public Employee(Integer id, String name, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@FunctionalInterface
	interface EmployeeFun<T> {
		boolean b(T t);
	}

	public static void main(String[] args) {
		Employee emp = new Employee(1, "p1", 20);
		Employee emp1 = new Employee(2, "p2", 20);
		Employee emp2 = new Employee(3, "p3", 24);
		Employee emp3 = new Employee(4, "p4", 24);

		list.add(emp);
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		EmployeeFun<Employee> em = (Employee emps) -> emps.age > 20;
		Predicate<Employee> pre = (Employee employee) -> employee.age > 20;
		list.stream().filter(pre).collect(Collectors.toList());
		Map<Integer, List<String>> map = list.stream()
				.collect(Collectors.groupingBy(s -> s.age, Collectors.mapping(m -> m.name, 
						Collectors.toList())));
		map.forEach((a1,a2)->{System.out.println(a1);
				for (String string : a2) {
			System.out.println(string);
		}});

	}

}
