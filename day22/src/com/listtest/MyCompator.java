package com.listtest;

import java.util.Comparator;

public class MyCompator implements Comparator<Student> {


	public int compare(Student s1, Student s2) {
		
		int res = s2.getScore()-s1.getScore();
		return res==0? s2.getName().compareTo(s1.getName()):res;
		
	}
	
}
