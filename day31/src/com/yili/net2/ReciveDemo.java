package com.yili.net2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.security.interfaces.DSAKey;

public class ReciveDemo {
	public static void main(String[] args) throws IOException {
		//1.创建接收端
		DatagramSocket ds=new DatagramSocket(10010);
		//2创建接收空间
		while (true) {
			
		
		byte[] bys=new byte[1024];
		DatagramPacket dp=new DatagramPacket(bys, bys.length);
		//3.接受文件并解析显示在控制台
		ds.receive(dp);
		String ip=dp.getAddress().getHostAddress();
		String data=new String(dp.getData(),0,dp.getLength());
		System.out.println("form:"+ip+"\tdata:"+data);
		}
		//4.释放资源
		//ds.close();
		
	}

}
