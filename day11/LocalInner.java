class Outer {
	int a = 123;
	private String str = "yili";
	
	void run (){
		String local_var = "局部变量";
		final int num = 1111;
		//局部内部类
		//public class Inner{}   error
		//static class Inner{}   error
		class Inner{
			int aaa=888;
			static final String a= "nihao";
			static final String s= "nihao2";
			
			void inner_run(){
				System.out.println("内部类:成员方法"+num);  //local_var不能访问局部变量
				System.out.println(a+"\t"+str);
				System.out.println(Outer.this.str);
			}
		}
	}
}



public class LocalInner{
	public static void main (String[] args){
	}
}