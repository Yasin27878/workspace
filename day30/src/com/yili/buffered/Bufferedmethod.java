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
public class Bufferedmethod {
	public static void main(String[] args) throws IOException{
		BufferedWriter bw=new BufferedWriter(new FileWriter("hello.txt"));
		BufferedReader br=new BufferedReader(new FileReader("hello.txt"));
		bw.write("hello");
		bw.newLine();
		
		bw.write("world");
		bw.newLine();
		
		bw.write("java");
		bw.newLine();
		bw.flush();
		
		String line=null;
		while ((line=br.readLine())!=null) {
			System.out.println(line);
		}
		
		bw.close();
		br.close();
	}

	
}
