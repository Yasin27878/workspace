/*
 * 异常处理 :
 * 	1.runtime 异常:程序员---抛出 vs jvm ---自动处理
 * 	2.checked 异常:程序员---抛出 vs 程序员 ---手动处理
 	
 	checked异常处理之一: throws
 	checked异常处理之二: try catch finally
 	
 	runtime异常是否可以用throws?=====程序员处理?
 	

 	1.什么时候会发生异常?
 	2.发生的是什么异常?---runtime/checked
 	3.根据异常类型,来考虑异常怎么处理?
 		A:runtime -------jvm处理
 		B:checked :				when?            how?
 				|-?throws    ===不知道如何处理	1.函数签名:throws+checked异常类名----抛给调用者---调用者处理--给上级--给jvm
 				|							2.keyi throws shengming duoge yichang tishi bangwo chuli
 				|-?try catch ====知道怎么解决
 	4.catch(){}-----?
 		
 * */
package com.yili.www;
//自定义checked异常
class FuException extends Exception{
	public  FuException() {}
	public  FuException(String message) {
		super(message);
	}
	public String toString() {
	//String message= new 
	return "cheng xu yuan chu li: "+ this.getMessage();
	} 
	
}

class Demo{
	/*
	 * 			判断异常---抛出异常---处理异常
	 * 	runtime 	代码中             		jvm
	 * 	checked ==========程序员处理========
	 * 
	 * 	分离
	 * */
	public void run (int[] arr,int index) throws FuException,NullPointerException,ArrayIndexOutOfBoundsException {
		if (arr==null) {
			throw new NullPointerException("jvm:空指针异常!");
		}
		
		if (index>=arr.length) {
			throw new ArrayIndexOutOfBoundsException("JVM:index大于了数组的长度");
		}else if (index<0) {
			
			throw new FuException("程序员处理:index是负数");
		}
		
	}
}

public class DiyTest {
	public static void main(String[] args) {
		int[] array = new int[5];
		Demo demo=new Demo();
		
		//array[-12]=123;
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: -12
		//at com.yili.www.DiyTest.main(DiyTest.java:59)
		
		try {
			//demo.run(array,-12);//从哪里看抛什么异常
			demo.run(array, 123);
		}catch (FuException fu) {
			// TODO: handle exception
			fu.printStackTrace();
			System.out.println(fu);
			System.out.println(fu.toString()+"\n"+fu.getMessage());
		}catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("jin ru catch yuju");
			System.out.println(e);
			e.printStackTrace();
			//return  //finallyjixuzhixing
			System.exit(123);
		}catch(Exception e){// suoyou
			System.out.println(e);
		}finally{//buguan ni zhengbuzhengchang nidoubixuzhixing
			System.out.println("finally");
			
		}
		//com.yili.www.FuException: 程序员处理:index是负数
		//at com.yili.www.Demo.run(DiyTest.java:48)
		//at com.yili.www.DiyTest.main(DiyTest.java:65)
		System.out.println("===============end===================");
		
	}
}
