package com.yili.Dielock;
/*
 * 死锁案例 有两把锁A,B 一个线程先使用了A锁,然后使用B锁,
 * 					另一个线程先使用B锁在使用A锁
 * */

public class DieLockDemo {

	public static void main(String[] args) {
		Lock l1=new Lock(true);
		Lock l2=new Lock(false);
		
		l1.start();
		l2.start();
		
	}

}
