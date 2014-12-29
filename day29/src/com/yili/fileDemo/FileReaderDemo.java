package com.yili.fileDemo;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		//1.创建对象
		FileReader fr=new FileReader("copy.java");
		//2.使用对象
		//(1)单个字符读取
//		int n=0;
//		while ((n=fr.read())!=-1) {
//			System.out.print((char)n);
//		}
		//(2)数组读取
		char[] str=new char[1024];
		int len=0;
		while ((len=fr.read(str))!=-1) {
			System.out.print(new String(str,0,len));
			System.out.print("len="+len);
			//System.out.print(String.valueOf(str,0,len));
		}
		
		//3.释放资源
		fr.close();
		
		
	}
}
