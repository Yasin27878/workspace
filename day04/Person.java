//怎么自定义类
public class Person{//public类和文件同名
	//成员变量
	String name;
	int age;
	
	//构造器是特殊的成员方法,作用是初始化成员变量,也可以重载
	// 与类同名 没有返回值
	//1.无参构造函数 
	Person(){
		System.out.println("this is nice man!我是自定义无参构造器");
	}
	//一参构造器
	Person (String name){
		System.out.println("this is nice man!我是一参构造器");
		this.name=name+"001";
		}
		//两参构造器
	Person (String name, int age){
		System.out.println("this is nice man!我是二参构造器");
		this.name=name+"002";
		this.age=age+1;
	}
		
	
	
	//成员方法
	void setName(String name){
		this.name=name;
		System.out.println("nihao");
	}
	String getName(){
		return this.name;
	}
	
	void info(){
		System.out.println("Name:"+this.name+"\t Age:"+
		this.age);
	}
	
	
}