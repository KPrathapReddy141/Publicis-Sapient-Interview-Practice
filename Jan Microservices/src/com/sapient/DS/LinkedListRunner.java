package com.sapient.DS;

public class LinkedListRunner {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.add(1);
		list.add(2);
		list.setAtStart(4);
		list.insertAt(5, 2);
		list.insertAt(6, 0);
		list.show();
		list.reverseList();
		
	}
}
