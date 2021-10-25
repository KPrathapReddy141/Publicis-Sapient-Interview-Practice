package com.sapient.DS;

public class LinkedList {

	public Node head;

	public void add(int data) {
     Node node=new Node();
     node.data=data;
     node.next=null;
     if(head==null) {
    	 head=node;
     }
     else {
    	 Node n=head;
    	 while(n.next!=null) {
    		 n=n.next;
    	 }
    	 n.next=node;
     }
	}
	public void show() {
		Node n=head;
		while(n!=null) {
			System.out.print(n.data+" ");
			n=n.next;
		}
	}
	public void removeByIndex(int index) {
		Node n=head;
		for(int i=0; i<index-1;i++) {
			n=n.next;
		}
		Node n2=n.next;
		n.next=n2.next;
	}
	public void setAtStart(int data) {
		Node node=new Node();
		node.data=data;
		node.next=null;
		node.next=head;
		head=node;
	}
	public void insertAt(int data,int index) {
		if(index==0) {
			setAtStart(data);
		}
		else {
		Node node=new Node();
		node.data=data;
		node.next=null;
		Node n=head;
		for (int i = 0; i < index-1; i++) {
			n=n.next;
		}
		node.next=n.next;
		n.next=node;
		}
		
	}
	public void reverseList() {
		Node previou=null;
		Node n=head;
		Node next=null;
		while(n!=null) {
			next=n.next;
			n.next=previou;
			previou=n;
			n=next;
		}
		System.out.println();
		while(previou!=null) {
			System.out.print(previou.data+"-->");
			previou=previou.next;
		}
		System.out.println("null");
	}
}

