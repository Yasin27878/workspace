package com.yili.IO;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * 字节输入流的操作步骤
 * 1.创建直接输入对象
 * 2.调用read方法,显示在控制台
 * 3.释放资源
 * */
public class FileinputStreamDemo {
	public static void main(String[] args) throws IOException{
		
		//1
		FileInputStream fis=new FileInputStream("fis.txt");
		//调用字符
//		int by=0;
//		while ((by=fis.read())!=-1) {
//			System.out.print((char)by);
//		}
		//调用字符数组
		byte[] bt=new byte[1024];
		int lenth=0;
		while ((lenth=fis.read(bt))!=-1) {
			System.out.println(new String(bt,0,lenth));
		}
		fis.close();
	}
}
