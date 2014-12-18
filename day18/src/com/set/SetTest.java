package com.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//set接口,无序不能重复
		Set set = new HashSet();

		set.add("yili");
		set.add("google");
		set.add("android");
		set.add("y");
		set.add("x");
		
		Iterator it= set.iterator();
		while (it.hasNext()) {
			Object object = (Object) it.next();
			System.out.println(object);
		}
		
		System.out.println(set.add("yili"));//?
		System.out.println(set.toString());
	}

}
