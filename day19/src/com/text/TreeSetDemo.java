package com.text;

import java.util.TreeSet;

public class TreeSetDemo {

	
	public static void main(String[] args) {
		
		TreeSet ts=new TreeSet(new Comparatorbylengh());
		
		ts.add("helloo");
		ts.add("world");
		ts.add("java");
		ts.add("jre");
		ts.add("doubi");
		ts.add("hello老四");
		System.out.println(ts);
		
		

	}

	@Override
	public String toString() {
		return "TreeSetDemo [toString()=" + super.toString() + "]";
	}

}
