package com.text.www;

public class FinallyFlowTest {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		boolean a=test();
		System.out.println(a);

	}
	public static boolean test() {
		try {
			return true;
		} finally  {
			return false;// TODO: handle exception
		}
	}

}
