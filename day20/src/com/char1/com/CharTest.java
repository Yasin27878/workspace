/*
 * 1. 使用合适的集合，统计字符串“13913535174”出现最多的字符次数。
 * */
package com.char1.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class CharTest{

	public static void main(String[] args) {
		
		String s = "13913535174";
	
		//定义集合
		ArrayList ts=new ArrayList();
		//将字符转化成整形
		long a=Long.parseLong(s);
		System.out.println(a);
		
		//把整形数分开并且赋值到集合中
		for (int i = 0; i < s.length(); i++) {
			long n= a%10;
			a/=10;
			ts.add(n);	
		}
		//打印集合
		for (Iterator iterator = ts.iterator(); iterator.hasNext();) {
			long object = (long) iterator.next();
			System.out.println(object);
		}
		//输出每个数有多少个
		for (int i = 0; i <s.length(); i++) {
			int m=1;
			for (int j = i+1; j <s.length() ; j++) {
				if (ts.get(i)==ts.get(j)) {
					m=m+1;
					if (j <s.length()) {
						System.out.println(ts.get(i)+"有"+m+"个");
					}
					
					int n=1;
					
					if(m>=n){
						n=m;
					if(j <s.length()){
						System.out.println("出现最多的数是"+ts.get(i)+"出现的次数是"+n+"次");
					}
						
						
					}
				}
				
			}
			
		}
		
		
		
	}

	
	

}
