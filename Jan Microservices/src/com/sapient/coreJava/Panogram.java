package com.sapient.coreJava;

public class Panogram {
	public static boolean panogram(String s) {
		boolean mark[] = new boolean[26];
		int index = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (ch >= 65 && ch <= 91)
				index = s.charAt(i) - 65;
			else if (ch >= 97 && ch <= 122)
				index = s.charAt(i) - 97;
			mark[index]=true;

		}
		for (int i = 0; i < mark.length; i++) {
			if(mark[i]==false) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String s = "ABCdefghijklmnopqrstuvwxyz";
		boolean b=panogram(s);
		if(b) {
			System.out.println("Panogram");
		}
		else System.out.println("Not a Panogram");
	}
}
