package com.yili.Dielock;

public class Lock extends Thread {
	
	private boolean flag;
	public Lock (boolean flag){
		this.flag=flag;
	}
	
	public void  run() {
		if(flag){
			while (true) {
				synchronized (MyLock.objA) {
					System.out.println("if objA");
					synchronized (MyLock.objB) {
						System.out.println("if objB");	
					}
					
				}
				
			}
		}else {
			while (true) {
				synchronized (MyLock.objB) {
					System.out.println("else objB");
					synchronized (MyLock.objA) {
						System.out.println("else objA");	
					}
					
				}
				
			}
		}
	}

}
