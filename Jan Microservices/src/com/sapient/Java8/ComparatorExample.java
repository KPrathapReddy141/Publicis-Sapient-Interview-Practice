package com.sapient.Java8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class ComparatorExample {
	static Scanner sca = new Scanner(System.in);
	static List<Person> list = new ArrayList<>();
	static TreeMap<Person, Integer> treemap = new TreeMap<>();

	public static TreeMap<Person, Integer> compa(String s) throws FileNotFoundException {
		sca = new Scanner(new File(s));

		while (sca.hasNext()) {
			String ss = sca.next();
			String str[] = ss.split(",");
			Person p = new Person();
			p.setId(Integer.parseInt(str[0]));
			p.setName(str[1]);
			p.setPhone(Long.parseLong(str[2]));
			p.setWorkLocation(str[3]);
			p.setGender(str[4]);
			p.setpAdd(str[5]);
			p.setjDate(str[6]);
			p.setAge(Integer.parseInt(str[7]));
			// list.add(p);
			treemap.put(p, 1);
		}
		;
		// return list;
		return treemap;
	}

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("enter path");

		String s = sca.nextLine();
		String input = sca.nextLine();
		// List<Person> list=compa(s);
		Comparator<Person> com = null;
		if (input.equals("name")) {
			com = (n1, n2) -> n1.getName().compareTo(n2.getName());
		} else if (input.equals("phone"))
			com = (n1, n2) -> n1.getPhone().compareTo(n2.getPhone());
		treemap = new TreeMap<>(com);
		treemap = compa(s);
		// Collections.sort(list,com);
		treemap.keySet().stream().forEach(a -> System.out.println(a.getPhone()));
//		for(Person person:list) {
//			System.out.println(person.getName());
//		}
	}

}
