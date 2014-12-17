package com.yili;

class Person{
	String name;
	int age;
	
	// void info(){	}
	public Person(){}
	public Person(String name,int age){
		this.name = name;
		this.age = age;
		
	}
	public  String toString(){
		//return  "复写了Object的toString方法";
		return "name:"+name+"\t age:"+age;
	}
	//同一类对象  属性?
	public boolean equals(Object obj){
	
		if(this == obj){
			return true;
		}
		//是否是同一类对象?
		boolean res = obj instanceof Person;
		Person r = (Person)obj;
		if(res){//同类
			if(this.name == r.name&& this.age == r.age){
				return true;
			}
			return false;
		}else{
			return false;
		}
	}
	
	
	
}
public class Test{
	public static void main(String[] args){
		Test test= new Test();
		System.out.println(test.getClass());
		//直接打印对象会默认调用toString方法
		System.out.println(test);
		System.out.println(test.toString());
		
		Person p = new Person("gem",12);
		Person p1 = new Person("google",13);
		System.out.println(p);
		Person p2 = p1;
		System.out.println("equals()"+p.equals(p1)+"\t=="+(p==p1));
		System.out.println("equals()"+p2.equals(p1)+"\t=="+(p2==p1));
		System.out.println(p2.equals(p1));
	}
}