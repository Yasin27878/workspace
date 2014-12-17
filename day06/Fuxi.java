public class Demo{
	 int getSum(int a,int b){
		return a + b;
	}
}

class Test{
	public static void main(String[] args){
		int a =10;
		int b =30;
		Demo d = new Demo();
		int result = d.getSum(a,b);
		System.out.println("a+b的结果是:"+result);
	
	}
}