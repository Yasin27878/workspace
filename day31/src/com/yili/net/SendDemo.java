package com.yili.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 * 1.创建socket对象
 * 2.创建发送报
 * 3.发送
 * 4.释放资源
 * 
 * 
 * */
public class SendDemo {

	public static void main(String[] args) throws IOException {
		DatagramSocket ds=new DatagramSocket();
		byte[] buf="辉哥,你太任性了,多读书,多看报,少去鲁".getBytes();
		int length=buf.length;
		InetAddress address=InetAddress.getByName("stubdd9b4");
		int port=10010;
		DatagramPacket dp=new DatagramPacket(buf, length, address, port);
		
		ds.send(dp);
		
		ds.close();
	
	}
}
