package com.java.recur;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println(revesre("JAVA"));

	}

	private static String revesre(String s) {
		if(s.length()==1) {
			return s;
		}
		
		return String.valueOf(s.charAt(s.length() - 1)) + revesre(s.substring(0,s.length()-1));
	}

}
