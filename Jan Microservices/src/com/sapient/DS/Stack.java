package com.sapient.DS;

public class Stack {
	int capacity = 5;
	int stack[] = new int[capacity];
	int top = 0;

	public void push(int data) {
		if (top >= 5) {
			System.out.println("stack is full");
		} else {
			stack[top] = data;
			top++;
		}
	}

	public int pop() {
		if(size()==0) {
			System.out.print("null");
			return 0;
		}
		else {
		top--;
		return stack[top];
		}
	}

	public int peek() {
		return stack[top - 1];
	}

	public int size() {
		return top;
	}

	public boolean isEmpty() {
		return top <= 0;
	}

	public void show() {
		for (Integer s : stack) {
			System.out.print(s + " ");
		}
	}
}
