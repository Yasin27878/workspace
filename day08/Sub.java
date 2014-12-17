public class Sub extends Base{
	String str="sub class";
	void sub_show(){
		System.out.println("sub特有的子类");
	}
	void show(){
		System.out.println("sub class");
	}
	
	public static void main(String[] args){
		//向上转型:默认基类引用 指向 子类对象
		Base base = new Sub();
		//System.out.println(base.str);
		//base.str;
		
		System.out.println(base.a);
		base.base_show();
		base.show();
		
		//向下转型
		Base ba = new Sub();
		Sub sub = (Sub)ba;
		//访问父类的属性
		System.out.println(sub.a);
		sub.base_show();
		//子类复写父类的方法
		sub.show();
		
		//访问子类的属性
	}
}