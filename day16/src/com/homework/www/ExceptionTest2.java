package com.homework.www;

public class ExceptionTest2 extends Exception{
	public ExceptionTest2(){}
	
	public ExceptionTest2(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		//String message= new 
		return "cheng xu yuan chu li: "+ this.getMessage();
		} 

	private void go() {
		int[] arr=new int[5];
		try {
			System.out.println("请为数组赋值:");
			arr[0]=5;
			arr[5]=6;
			
		} catch (Exception ex) {
			// TODO: handle exception
			throw new ArrayIndexOutOfBoundsException ("越界!");
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExceptionTest2 ex=new ExceptionTest2();
		ex.go();
	}

}
