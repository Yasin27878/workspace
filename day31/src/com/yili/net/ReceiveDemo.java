package com.yili.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
/*
 * 接收端的四个步骤
 * 1.创建接收端socket服务
 * 2.创建接受数据包空间
 * 3.接受数据包 并解析显示在控制台
 * 4.释放资源
 * 
 * */
import java.net.SocketException;

public class ReceiveDemo {

	public static void main(String[] args) throws IOException {
		//1.创建接收端socket服务
		DatagramSocket ds=new DatagramSocket(10010);
		//2.创建接受数据包空间
		byte[] bys=new byte[1024];
		DatagramPacket dp=new DatagramPacket(bys, bys.length);
		//3.接受数据包 并解析显示在控制台
		ds.receive(dp);
		
		String ip=dp.getAddress().getHostAddress();
		String data=new String(dp.getData(),0,dp.getLength());
		System.out.println("from:"+ip+"-----"+"data:"+data);
		
		//4.释放资源
		ds.close();
	}
}
