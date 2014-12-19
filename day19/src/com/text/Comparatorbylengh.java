package com.text;

import java.util.Comparator;


public class Comparatorbylengh implements Comparator {

	
	public int compare(Object o1, Object o2) {
		
		String t1=(String)o1;
		String t2=(String)o2;
		
		int res=t1.length()-t2.length();
		
		return res==0?t1.compareTo(t2):res;
		
	
		
		
		
	}

}
