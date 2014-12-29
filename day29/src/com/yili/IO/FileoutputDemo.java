package com.yili.IO;
    //
	//1.创建字符输出对象
	//2.使用字符输出对象的write方法
	//3.释放资源

import java.io.FileOutputStream;
import java.io.IOException;

public class FileoutputDemo  {
	public static void main(String[] args) throws IOException {
		
	
	//1.创建字符输出对象
	//2.使用字符输出对象的write方法
	//3.释放资源
		//1.创建字符输出对象
	FileOutputStream fos =new FileOutputStream("fos.txt");
	//2.使用字符输出对象的write方法
	//fos.write(99);
	fos.write("helloworld".getBytes(),0,5);
	
	
	
	//3.释放资源
	fos.close();
	
	
	}
}
