package com.test.www;

import java.util.ArrayList;
import java.util.List;

public class LestTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List books = new ArrayList();
		//向books中加入三个元素
		books.add(new String("j2ee"));
		books.add(new String("jre"));
		books.add(new String("javaweb"));
		System.out.println("books");
		//将新字符串对象插在第二个位置
		books.add(1,new String("yili"));
		for (int i = 0; i < books.size(); i++) {
			System.out.println(books.get(i));
		}
		//删除第三个元素
		books.remove(2);
		System.out.println(books);
		
		//判断指定元素在list集合中的位置:输出1表示在第2位
		System.out.println(books.indexOf(new String("yili")));
		//将第二个元素替换成新的字符串对象
		books.set(1, new String("jre"));
		System.out.println(books);
		System.out.println(books.subList(1, 2));
	}

}
