package com.text.www;

import java.util.Date;


public class NullTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Date d = null;
		try {
			System.out.println(d.after(new Date()));
		} catch (NullPointerException ne) {
			System.out.println("空指针异常");// TODO: handle exception
		}catch (Exception e) {
			System.out.println("未知异常");// TODO: handle exception
		}
	}

}
