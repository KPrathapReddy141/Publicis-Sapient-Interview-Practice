package com.sapient.Java8;

import java.util.Arrays;
import java.util.List;

public class ChangeFirstCharAsCaps {

	public static void fstCharAsCaps(String s) {
		String str[] = s.split(" ");
		for (int i = 0; i < str.length; i++) {
			if (!(str[i].charAt(0) >= 65 && str[i].charAt(0) <= 91)) {
				char ch = (char) (str[i].charAt(0) - 32);
				char cha[] = str[i].toCharArray();
				cha[0] = ch;
				String ss = String.valueOf(cha);
				str[i] = ss;

			}
		}
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}

	}
	
	public static void fstCharAsCaps2(List<String> list) {
		list.stream().map(a->{
			if(!(a.charAt(0)>=65 && a.charAt(0)<=91)) {
				char c=(char)(a.charAt(0)-32);
				char ch[]=a.toCharArray();
				ch[0]=c;
				a=String.valueOf(ch);
			}
			return a;
		}).forEach(System.out::println);
		
	}

	public static void main(String[] args) {
		String s = "Hello hai how Are U";
		fstCharAsCaps(s);
		List<String>list=Arrays.asList("Hello","hai","how");
		fstCharAsCaps2(list);
		
	}
}
