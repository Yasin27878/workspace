package com.yili.thread;

public class RunableThread  implements Runnable{
	private int i;
	
	
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(Thread.currentThread().getId()+Thread.currentThread().getName());
		}
	}

	
	public static void main(String[] args) {
		
		RunableThread rd=new RunableThread();
		
		
		Thread th=new Thread(rd);
		Thread th1=new Thread(rd);
		
		th.start();
		th1.start();
	}


	
}
