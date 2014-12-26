package com.yili.Dielock;
//
public class JoinDemo extends Thread{

	public void run(){
		for (int i = 0; i < 100; i++) {
			System.out.println(getName()+i);
		}
		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().
				getName()+"开启");
		for (int i = 0; i < 100; i++) {
			System.out.println("main:"+i);
			if (i==38) {
				JoinDemo jd=new JoinDemo();
				jd.start();
				//在主线程调用了jd的join(),main线程等待
				//jd线程结束,才能继续执行
				//加入当前线程调用了另外一个线程,泽执行另外的那个线程知道那个线程执行完毕才执行当前线程
				jd.join();
			}
		}
		
		
		
		
		System.out.println(Thread.currentThread().
				getName()+"关闭");
		
	}
}
