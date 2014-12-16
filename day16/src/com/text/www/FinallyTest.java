package com.text.www;

import java.io.FileInputStream;
import java.io.IOException;

public class FinallyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis=null;
		try {
			fis= new FileInputStream("a.txt");
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
			//return;// TODO: handle exception---1
			System.exit(1);///////---------------2
		}
		finally{
			if (fis!=null) {
				try {
					fis.close();
				} catch (IOException ioe) {
					ioe.printStackTrace();// TODO: handle exception
				}
			}
			System.out.println("执行finally块里的资源回收!");
		}
	}

}
