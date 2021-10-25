package com.sapient.coreJava;

import java.util.ArrayDeque;
import java.util.Deque;

public class Balenced_equation {
	public static boolean balEqu(String s) {
		 Deque<Character> stack 
         = new ArrayDeque<Character>();
		for (int i = 0; i < s.length(); i++) {
			char x=s.charAt(i);
			if(x=='(' ||x=='{' ||x=='[') {
				stack.push(x);
				continue;
			}
			if(stack.isEmpty()) {
				return false;
			}
			char check;
			switch(x) {
			case ')':
					check=stack.pop();
					if(check=='{' || check=='[') {
						return false;
					}
					break;
			case '}':
					check=stack.pop();
					if(check=='(' || check=='[') {
						return false;
					}
					break;
			case ']':
					check=stack.pop();
					if(check=='(' || check=='{') {
						return false;
					}
					break;
				
			}
			
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		String s = "{[()]}";
		System.out.println(balEqu(s));
	}
}
