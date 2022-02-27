package com.demo;

public class PrintwithoutConcat { 
	public static void main(String args[]){ 
		int a=5;
		char ch='b';
		String str;
		str=((Integer.toString(a))+"+"+(Character.toString(ch)));
		System.out.println("value= "+str);
	}


}
