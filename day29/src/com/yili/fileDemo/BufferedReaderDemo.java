package com.yili.fileDemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("copy.java"));
		
		char[] arr=new char[1024];
		int len=0;
		while ((len=br.read(arr))!=-1) {
			System.out.println(new String(arr,0,len));
		}
		
		
		br.close();
		
	}

}
