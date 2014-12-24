package com.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		//创建集合
		Map<Integer,String> map= new HashMap<>() ;
		
		//添加元素
		map.put(101, "刘德华");
		map.put(102, "谢霆锋");
		map.put(103, "梁朝伟");
		map.put(104, "周华健");
		map.put(105, "吴奇隆");
		//遍历
		for (Integer i : map.keySet()) {
			String value= map.get(i);
			System.out.println(i+"-----"+value);
		}
		
		

	}

}
