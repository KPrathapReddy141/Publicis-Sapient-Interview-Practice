package com.sapient;

public class LinkedList {
	public void revLinedList() {
		Node n=head;
		Node Previous=null;
		Node next=null;
		while(n!=null) {
			next=n.next;
			n.next=Previous;
			Previous=n;
			n=next;
		}
		while(Previous!=null) {
			System.out.println(Previous.data);
			Previous=Previous.next;
		}
		
	}
	public void removenthEle(int index) {
		node n=
	}

}
