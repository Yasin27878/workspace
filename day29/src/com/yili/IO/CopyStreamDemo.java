package com.yili.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyStreamDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream  fis=new FileInputStream("FileoutputDemo.java");
		FileOutputStream fts=new FileOutputStream("D:\\copy");
		
		
		byte[] by=new byte[1024];
		int len=0;
		while ((len=fis.read(by))!=-1) {
			fts.write(by,0,len);
		}
		
		
		
		fts.close();
		fis.close();
	}
}
