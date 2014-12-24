package com.zuoye;
import java.util.HashMap;
import java.util.Map.Entry;

/*
 *
 * 使用合适的集合，统计字符串“13913535174”出现最多的字符次数。
 */

public class maxcount {
	     
	      public static void main(String[] args) {        
	          String str = "13913535174";
	          HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	          Character maxChar = null;
	          Integer maxCount = 0;
	      
	        // 将字符串的中所有字符放到map中，key为字符，value重复次数
	        for (Character c : str.toCharArray()) {
	            if (map.containsKey(c)) { 
	                map.put(c, map.get(c) + 1); //已经加入过的char，将原计数值加1
	            } else {
	                map.put(c, 1); //没有加过的char，直接加入，计数1
	            }
	        }   
	         
	        //找到重复次数最大的字符
	        for (Entry<Character, Integer> entry : map.entrySet()) {
	            if (entry.getValue() >= maxCount) {
	                maxChar = entry.getKey();
	                maxCount = entry.getValue();
	                System.out.println("Char:" + maxChar + "  Max:"  + maxCount);
	             
	        }
	         
	        //System.out.println("Char:" + maxChar + "  Max:"  + maxCount);
	      }
	}
}