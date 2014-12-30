package com.yili.buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*键盘录入文本
 * 输入指定字符结束
 * */
public class ScannerDemo {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		//创建对象
		BufferedWriter bw=new BufferedWriter(new FileWriter("java.txt"));
		//使用方法
		String line=null;
		while ((line=sc.nextLine())!=null) {
			if ("o".equals(line)) {
				break;
			}
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		
		//释放资源
		sc.close();
		bw.close();
		
	}
	
}
