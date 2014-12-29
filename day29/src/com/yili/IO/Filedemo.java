package com.yili.IO;

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;

public class Filedemo {
	//. 当前路径
	//.. 上一级目录
	public static void main(String[] args) throws IOException {
		//System.out.println("nihao ");
		File file =new  File(".");
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.getAbsolutePath());//string
		System.out.println(file.getAbsoluteFile());//file
		System.out.println(file.getAbsoluteFile().getParent());//file
		System.out.println(file.getParent());
		//创建文件
		File tmpfile=File.createTempFile("temfile", ".txt");
		File tmp=File.createTempFile("temfile", ".txt", file);
		
		File[] st=File.listRoots();
		for (File file2 : st) {
			System.out.println(file2);
		}
		
	}

}
