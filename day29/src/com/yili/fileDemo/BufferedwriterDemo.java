package com.yili.fileDemo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedwriterDemo {
	public static void main(String[] args) throws IOException{
		
		FileWriter fw=new FileWriter("susu.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		BufferedWriter bw2=new BufferedWriter(new FileWriter("nihao.txt"));
		bw.write("nihao");
		bw.write("lisusu", 0, 4);
		bw2.write("nihaopiaoliang");
		bw2.write("lisusu", 1, 4);
		bw.close();
		bw2.close();
	}

}
