package com.text.www;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintStream;

public class AutoCloseTest {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
			try (
				//声明两个可关闭的资源
				//try语句会自动关闭两个资源
				BufferedReader br = new BufferedReader(new FileReader("AutoCloseTest.java"));
				PrintStream ps = new PrintStream(new FileOutputStream("a.txt")))
			 {
				// TODO: handle exception
				System.out.println(br.readLine());
				ps.print("忽喇喇似大厦倾");
			}
	}

}
