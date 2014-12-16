
package Test;

import java.awt.peer.SystemTrayPeer;

/*
 * 自定义异常类:必须继承Exception异常,可抛性=抛给调用者
 * 	实现了整个的逻辑处理和异常处理的分离
 * 负下标异常
 * */

class FuExecption extends RuntimeException{
	public  FuExecption() {	
	}

	public FuExecption(String message) {
		super(message);//
	}	
}

class Test{
	void  run(int [] arr,int index){ //throws FuExecption{
		//if (arr==null) {
		//throw new NullPointerException();
	//	throw new NullPointerException("空指针异常!");
		//}
//		//System.out.println(arr[index]);
		if (arr == null ) {
			//异常对象:new +构造
			throw new NullPointerException("空指针异常");
		}
		if (index<0) {
			//throw new ArrayIndexOutOfBoundsException("下表为负");
			throw new FuExecption("自定义负下标异常!");
			
		}else if(index >= arr.length){
			throw new ArrayIndexOutOfBoundsException("index="+index+">=数组长度");
		}else {
			System.out.println(arr[index]);
		}
		//ArrayIndexOutOfBoundsException
	//System.out.println("arr[index]");
	}
}



public class ExecptionDemo {
	//演示抛出异常的流程

	public static void main(String[] args) throws FuExecption {
		int [] arr= new int [5];
		int []array=null;
		//1.非法操作数组
		//arr[5]=1231;
		//array [0]=123;
		
		//2.调用成员方法 在成员方法中非法操作数组
		//run(arr,6);
		
		//3.其他类的成员方法中非法操作
		Test test=new Test();
		//test.run(arr,-1);
		test.run(arr, -5);
		//Test test1=new Test();
		
		//test1.run(array, 1);
		System.out.println("============end=============");
	}
	public static void run(int[] arr,int index){
		System.out.println(arr[index]);
	}
}
 