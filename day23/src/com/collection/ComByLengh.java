package com.collection;

import java.util.Comparator;


//public class ComByLengh implements Comparator<String> {
//
//	public int compare(String o1, String o2) {
//		// TODO Auto-generated method stub
//		return o1.length()-o2.length();
//		
//	}
//
//}
public class ComByLengh implements Comparator<Person> {

	public int compare(Person o1, Person o2) {
		
		int res=o1.getAge()-o2.getAge();
		return res==0?o1.getName().compareTo(o2.getName()):res;
		
	}

}


