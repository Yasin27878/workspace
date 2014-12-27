package com.yili.IOReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderStrDemo {

	public static void main(String[] args) throws IOException {
		//创建读取对象
		
		FileReader fr=new FileReader("file.txt");
		
		//public int read(char[] cbuf)
		 char [] str=new char[1024];
		 int len=0;
		 while ((len=fr.read(str))!=-1) {
			System.out.println(String.valueOf(str,0,len));
		}
		 //释放资源
		 fr.close();
		
	}
}
