package com.set;

import java.util.Iterator;
import java.util.TreeSet;

class Errs{}

public class TreeSetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		TreeSet ts=new TreeSet();
//		ts.add(3);
//		ts.add(4);
//		ts.add(-3);
//		ts.add(9);
//		ts.add(-15);
//		ts.add(0);
//		ts.add(56);
		
		
		
		ts.add("abc");
		ts.add("nba");
		ts.add("cba");
		ts.add("cuba");
		ts.add("cf");
		
		for (Iterator it = ts.iterator(); it.hasNext();) {
			String object = (String) it.next();
			System.out.println(object);
			
		}
		
		System.out.println(ts);
		System.out.println(ts.first());
		System.out.println(ts.last());
		
		TreeSet ts2=new TreeSet();
		
		
	}

}
