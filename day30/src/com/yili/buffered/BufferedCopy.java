package com.yili.buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 *  BufferedReader    String readLine()    读取一个文本行 
    BufferedWriter    void newLine()       写入一个行分隔符。 
 * 
 * */
public class BufferedCopy {

	public static void main(String[] args) throws IOException{
		//创建对象
		BufferedReader br=new BufferedReader(new FileReader("copy.java"));
		BufferedWriter bw=new BufferedWriter(new FileWriter("copy2.txt"));
		//适用对象复制文件
		String line=null;
		while ((line=br.readLine())!=null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		//释放资源
		br.close();
		bw.close();
	}
}
