package com.sapient.DS;

public class DStack {

	int capacity = 2;
	int stack[] = new int[capacity];
	int top = 0;

	public void push(int data) {
		if (size() == capacity) {
			expand();
		}

		stack[top] = data;
		top++;

	}

	public void expand() {
		int ex[] = new int[capacity * 2];
		System.arraycopy(stack, 0, ex, 0, capacity);
		stack = ex;
		capacity = capacity * 2;
	}

	public void pop() {
		if (size() == 0) {
			System.out.println("null");
		} else {
			top--;
			System.out.println(stack[top]);
			shink();
		}

	}

	public void shink() {
		int length = size();

		if (length <= (capacity / 2) / 2)
			capacity = capacity / 2;
		int newArr[] = new int[capacity];
		System.arraycopy(stack, 0, newArr, 0, length);
		stack = newArr;
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
