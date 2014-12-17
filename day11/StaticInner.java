class Outer{
	int a = 123;
	private String str= "外部类的变量";
	//静态成员内部类
	static class Inner{
	
		String str = "内部类的变量";
		void run(){
			
			System.out.println(a);
			System.out.println(str);
			
		}
		static String staticstr= "内部类静态变量";
		static void staticrun(){
		System.out.println("内部类静态方法");
	}
	
	//成员方法
	void run (){
		System.out.println("Inner.staticstr");
		Inner.staticrun();
		//对内部类的实例变量,实例方法
		Inner in= new Inner();
		System.out.println("in.str");
		in.run();
		
	}
}
public class StaticInner{
	public static void main (String[] args){
		Sysytem.out.println("Inner,staticstr");
		Outer.Inner.staticrun();
		
		//3内部类
		Outer.Inner in = new Outer().new Inner();
		System.out.ptrintln(in.str);
		in.run();
		in.staticrun();
		
	}
}