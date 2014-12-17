//输出1-9999999之间的所有的回环数;
/* import java.util.Scanner;
public class HuiHuan{
	public static void main(String args[]){
	
		
		int num1=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数:");
		int num = sc.nextInt();
		int n=num;
		int [] arr=new int[8]; 
		int index=0;
		while(num>0){
		arr[index]=num%10;
		num/=10;
		index++;
		}
		
		for(int i=0;i<index;i++){
		num1=(num1+arr[i])*10;
		}
		if(n==num1){
			System.out.println(num+"是一个回还数");
		}else {
			System.out.println(num+"不是一个回还数");
		}
		
	}
} */
//a1+10*a2

import java.util.Scanner;

/**
 * 判断一个数的位数 并且判断是不是为回文数
 * 
 */
public class HuiHuan {
	public static void main(String[] args) {
		long a = 0;
		System.out.println("输入一个数");
		// 从键盘获取一个数
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		long i = sc.nextInt();
		// 因为之后的i会改变 所以先赋值给l
		long l = i;
		// 输出这个数是几位数
		System.out.println("你输入的  " + (i + "") + " 是  " + (i + "").length()
				+ "位数");
		// 通过for 循环 让这个数首位交换 得到a
		for (int j = 0; j < (l + "").length(); j++) {
			a = a * 10 + i % 10;
			i = i / 10;
		}
		// 判断首尾交换后是否等于原值
		if (a == l) {
			System.out.println("你输入的" + l + "是回文数");
		} else {
			System.out.println("你输入得" + l + "不是回文数");
		}
	}
}