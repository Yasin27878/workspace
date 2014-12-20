/*
 * 4、回文数。      
  	编写一个Java应用程序。用户从键盘输入一个1—9999之间的数，程序将判断这个数是几位数，并判断这个数是否是回文数。
  	回文数是指将该数含有的数字逆序排列后得到的数和原数相同，例如12121、3223都是回文数。
  */
package com.zuoye.com;

import java.util.Scanner;

public class Huiwen {

	public static void main(String[] args) {
		System.out.println("请输入一个1-9999之间的数:");
		Scanner scanner= new Scanner(System.in);
		int a=scanner.nextInt();
		
		System.out.println("你输入的这个数是"+(""+a).length()+"位数");
		
		int b=a;
		int m=0;
		int c=(""+a).length();
		
		for (int i = 0; i <c ; i++) {
			m=m*10+a%10;
			b=b/10;
			
		}
		if (m==a) {
			System.out.println("你输入的这个数"+a+"是一个回文数");
		}else {
			System.out.println("你输入的这个数"+a+"不是一个回文数");
		}
		
	}

}
