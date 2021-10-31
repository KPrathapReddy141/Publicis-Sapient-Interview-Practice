package com.sapient;

public class Panogram {
	public static boolean panogram(String s) {
		boolean b[]=new boolean[26];
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			int index=0;
			if(ch>=65 && ch<=91) {
				index=ch-65;
				b[index]=true;
			}
			else if(ch>=97 && ch<=122) {
				index=ch-97;
				b[index]=true;
			}
			
			
		}
		for (int i = 0; i < b.length; i++) {
			if(b[i]==false) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String s=" abc dEfg hIjk lmnop  yuyuv kfgdqr stuvw xyz";
		System.out.println(panogram(s));
	}
}
