package com.yili.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("FileoutputDemo.java");
		FileOutputStream fos=new FileOutputStream("copy.java");
		
		byte[] bu=new byte[1024];
		int len =0;
		while ((len=fis.read(bu))!=-1) {
			fos.write(bu,0,len);
			System.out.println(new String(bu,0,len));
		}
		fis.close();
		fos.close();
	}
}
