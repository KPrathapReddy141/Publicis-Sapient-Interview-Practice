package com.sapient.DS;

public class RunnerForStack {

	public static void main(String[] args) {
		DStack s=new DStack();
		s.push(20);
		s.push(30);
		
		s.push(60);
		//System.out.println(s.peek());
		
		System.out.println(s.isEmpty());
		System.out.println(s.size());
		//System.out.println(s.pop());
		s.show();
	}
}
