package com.text.www;

public class DivTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			int a= Integer.parseInt(args[0]);
			int b= Integer.parseInt(args[1]);
			int c =a/b;
			System.out.println("您输入的两个数相除的结果是:"+c);
			
		} catch (IndexOutOfBoundsException ie) {
			// TODO: handle exception
			System.out.println("数组越界:运行时参数不够");
			
		}catch (NumberFormatException ne) {
			System.out.println("数字格式异常:程序只接受整数");// TODO: handle exception
		}catch (ArithmeticException ae) {
			System.out.println("算术异常");// TODO: handle exception
		}catch (Exception e) {
			System.out.println("未知异常");// TODO: handle exception
		}
	}

}
