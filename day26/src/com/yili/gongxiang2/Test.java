package com.yili.gongxiang2;

class Resource{
	int id;
	String name;
	boolean flag = false;//是否有产品
	
	public synchronized void set(int id,String name) {
		this.id=id;
		this.name=name;
		if (this.flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public synchronized void sales(){
		
	}
}

//产线
class Input implements Runnable{
	
	Resource r;
	int  key =0;
	public Input(Resource r) {
		super();
		this.r = r;
	}

	public void run(){
		
		
		while (true) {
			
			
			switch (key++%3) {
			case 0:
				r.set(666, "iphone6");
				
				break;
			case 1:
				r.set(777, "iphone7");
			
				break;
			case 2:
				r.set(888, "iphone8");
				
				break;

			default:
				break;
			}
			r.flag=true;
			r.notify();
			
		}
	}
}
/*
 *
 * 
 */
class Output implements Runnable{
	Resource r;	
	
	public Output(Resource r) {
		super();
		this.r = r;
	}

	public void  run() {
		//1.产品
		
		while (true) {	
			synchronized (r) {
				if (!r.flag) {//没产品
					try {
						r.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
		
			System.out.println("卖:"+r.name+"\t id:"+r.id);
			r.flag=false;
			r.notify();
			}
			
		}
	}
	
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建共享资源
		Resource r=new Resource();
		//创建线程任务 run
		Input  input  = new Input(r);
		Output output = new Output(r);
		//创建线程对象
		 
		Thread in=new Thread(input);
		Thread out=new Thread(output);
		//开始工作
		in.start();
		out.start();
		
		

	}

}
