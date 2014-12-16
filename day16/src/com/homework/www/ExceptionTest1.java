package com.homework.www;

public class ExceptionTest1 {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			int  a=2;
			int b=0;
			int c=a/b;
		}catch(ArithmeticException c){
			System.out.println("运算异常,不能除以0!");
		}finally{
			System.out.println("好好学习,天天向上");
		}
	}

}
