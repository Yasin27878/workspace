public class Demo{
	int a;
	int b;
	 int getSum(){
		return a + b;
	}
}

class Test{
	public static void main(String args[]){
		int a =10;
		int b =30;
		Demo d = new Demo();
		
		d.a=a;
		d.b=b;
		int result = d.getSum();
		System.out.println("a+b的结果是:"+result);
	
	}
}