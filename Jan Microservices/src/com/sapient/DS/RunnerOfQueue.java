package com.sapient.DS;

public class RunnerOfQueue {

	public static void main(String[] args) {
		Queue q=new Queue();
		q.bQueue(20);
		q.bQueue(30);
		q.bQueue(2);
		q.bQueue(3);
		q.dQueue();
		q.dQueue();
		q.bQueue(201);
		q.bQueue(301);
		q.bQueue(35);
		q.show();
	}
}
