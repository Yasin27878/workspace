package com.yili.www;

public class StringBuilderTest {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 StringBuilder sb = new StringBuilder();
		 sb.append("java");
		 sb.insert(0, "hello");
		 sb.replace(5, 6, ",");
		 sb.delete(5, 6);
		 System.out.println(sb);
		 sb.reverse();
		 System.out.println(sb);
		 System.out.println(sb.length());
		 System.out.println(sb.capacity());
		 sb.setLength(5);
		 System.out.println(sb);
	}

}
