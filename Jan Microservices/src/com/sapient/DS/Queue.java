package com.sapient.DS;

public class Queue {
	int capacity=5;
	int queue[]=new int[capacity];
	int first;
	int rere;
	int size;

	public void bQueue(int data) {
		if(size==capacity) {
			System.out.println("data is full");
		}
		else {
		queue[rere]=data;
		rere=(rere+1)%5;
		size++;
		}
	}
	public int dQueue() {
		int data=queue[first];
		if(isEmp()) {
			System.out.println("no data");
		}
		else {
		first=(first+1)%5;
		size--;
		}
		return data;
	}
	public boolean isEmp() {
		return rere<=0;
	}
	public int size() {
		return size;
	}
	public void show() {
		for (int i = 0; i < size; i++) {
			System.out.print(queue[(first+i)%5]+" ");
		}
		System.out.println();
	}
}
