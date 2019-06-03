package com.ban.common.programming;

public class Test {
	public void foo(Object o) {
		System.out.println("Object");
	}

	public void foo(String s) {
		System.out.println("String");
	}

	public void foo(Integer i){
		System.out.println("Integer");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("pankaj");
		String s2 = new String("PANKAJ");
		System.out.println(s2 = s1);



	}

}
