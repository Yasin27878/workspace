package com.yili.fileDemo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copyfile {
	public static void main(String[] args) throws IOException{
		//1.创建对象
		FileReader fr=new FileReader("copy.java");
		FileWriter fw=new FileWriter("yili.txt");
		
		//2.使用对象
		char[] str=new char[1024];
		int len=0;
		while ((len=fr.read(str))!=-1) {
			System.out.println(new String(str,0,len));
			fw.write(str,0,len);
		}
		
		//3.释放资源
		fr.close();
		fw.close();
	}

}
