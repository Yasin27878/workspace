package com.yili.net;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class URLDecoderTest {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String keyWord=URLDecoder.decode("%B7%E8%BF%8F1java","GBK");
		
		System.out.println(keyWord);
		//将普通字符转化成 网页www字符串
		String urlStr=URLEncoder.encode("2014网络流行词","GBK");
		System.out.println(urlStr);
		String urlStr1=URLEncoder.encode("疯狂java","GBK");
		System.out.println(urlStr1);
		
		
	}
}
