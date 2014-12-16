package com.text.www;




public class MultiExceptionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			int a= Integer.parseInt(args[0]);
			int b= Integer.parseInt(args[1]);
			int c =a/b;
			System.out.println("您输入的两个数相除的结果是:"+c);
		} catch (IndexOutOfBoundsException|NumberFormatException|ArithmeticException ie) {
			// TODO: handle exception
			System.out.println("程序发生数组越界,数字格式异常,算术异常之一");
			//ie = new ArithmeticException("test");
		}catch (Exception e) {
			System.out.println("未知异常");// TODO: handle exception
			e= new RuntimeException("test");
			
		}
		
	}

}
