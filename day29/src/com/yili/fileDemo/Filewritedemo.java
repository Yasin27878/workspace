package com.yili.fileDemo;

import java.io.FileWriter;
import java.io.IOException;

public class Filewritedemo {

	public static void main(String[] args) throws IOException{
		FileWriter fw=new FileWriter("fis.txt");
		fw.write("你是谁");
		fw.flush();
		fw.close();
	}
}
