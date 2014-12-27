package com.yili.copyfile;

import java.awt.Frame;
import java.beans.FeatureDescriptor;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyStrDemo {
	public static void main(String[] args) throws IOException {
	
		//创建读取对象
		FileReader fr=new FileReader("file.txt");
		FileWriter fw=new FileWriter("b.txt");
		//读写数据
		//public int read(char[] cbuf)
		char [] str=new char [1024];
		int len=0;
		while ((len=fr.read(str))!=-1) {
			fw.write(str,0,len);
		}
		
		
		//释放资源
		fr.close();
		fw.close();
		
		
		
		
		
	}
}
