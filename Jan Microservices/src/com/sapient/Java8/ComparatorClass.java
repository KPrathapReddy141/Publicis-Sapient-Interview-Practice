package com.sapient.Java8;

import java.util.Comparator;

public class ComparatorClass implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
