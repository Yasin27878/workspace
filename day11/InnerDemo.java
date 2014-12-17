class Outer{
	int a = 123;
	private String str= "外部类的变量";
	//成员内部类
	class Inner{
		final static int a = 321;
		String str = "内部类的变量";
		void run(){
			String str = "局部变量";
			System.out.println("内部类run()");
			System.out.println(a);
			System.out.println(str);
			System.out.println(this.str);
			System.out.println(Outer.this.str);
		}
	}
	
	//成员方法
	void run (){
		System.out.println("外部类run()");
		Inner in= new Inner();
		in.run();
	}
}
public class InnerDemo{
	public static void main (String[] args){
		//外部类使用
		Outer outer=new Outer();
		outer.run();
		
		//3内部类
		Outer.Inner inner = new Outer().new Inner();
		inner.run();
		
	}
}