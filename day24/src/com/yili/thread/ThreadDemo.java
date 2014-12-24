package com.yili.thread;

class Monkey1 extends Thread{
	String name;
	public Monkey1(String name){
		super();
		this.name=name;
		
	}
	public void fight(){
		for (int i = 0; i < 11; i++) {
			System.out.println(name+"打败第"+i+"个天兵天将");
		}
		
	}
	public void run() {
		fight();
		System.out.println(Thread.currentThread().getId()+Thread.currentThread().getName());
	}
	
}

public class ThreadDemo {

	public static void main(String[] args) {

		Monkey1 m1=new Monkey1("第1个小悟空");
		Monkey1 m2=new Monkey1("第2个小悟空");
		Monkey1 m3=new Monkey1("第3个小悟空");
		 m1.start();
		 m2.start();
		 m3.start();
		 System.out.println(Thread.currentThread().getId()+Thread.currentThread().getName());
	}

}
