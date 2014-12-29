package com.yili.fileDemo;
/*
 * 复制图片到指定的目录 并改名
 * */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyimageDemo {

	public static void main(String[] args) throws IOException {
		//1.
		FileInputStream fis=new FileInputStream("D:\\登陆界面.jpg");
		FileOutputStream fos=new FileOutputStream("C:\\Users\\C4\\Desktop\\nihao.jpg");
		//2.
		int n=0;
		while ((n=fis.read())!=-1) {
			fos.write(n);
		}
		//3.
		fis.close();
		fos.close();
	}
}
