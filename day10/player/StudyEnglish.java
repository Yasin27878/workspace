/*
	乒乓球运动员和篮球运动员。
		乒乓球教练和篮球教练。
		为了出国交流，跟乒乓球相关的人员都需要学习英语。
		请用所学知识：
			分析，这个事情中有哪些抽象类，哪些接口，哪些具体类。

	通过画图分析：
		有一个接口：学英语的接口 
		有三个抽象类：运动员类  教练类  人类
		有四个具体类：乒乓球运动员 乒乓球教练 篮球运动员  篮球教练
		有一个测试类：Test
*/
//说英语接口
 public interface StudyEnglish{
	public abstract void speak();
}
//人类抽象类
 abstract class Person{
	private String name;
	private int age;
	public Person(){}
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}
	//吃的抽象方法
	public abstract void eat();
}
//运动员抽象类
 abstract class Player extends Person{
	public Player(){}
	public Player(String name,int age){
		super(name,age);
	}
	
	//学习的抽象方法
	public abstract void study();
}
//教练抽象类
 abstract class Coach extends Person{
	public Coach(){}
	public Coach(String name,int age){
		super(name,age);
	}
	//教的抽象方法
	public abstract void teach();
	
}
//具体的运动员类:

//具体的乒乓球运动员类
 class PingpangPlayer extends Player implements StudyEnglish{
	public PingpangPlayer(){}
	public PingpangPlayer(String name,int age){
		super(name,age);
	}
	public void speak(){
		System.out.println("乒乓球运动员说英语!");
	}
	public void eat(){
		System.out.println("乒乓球运动员吃鸡蛋!");
	}
	public void study(){
		System.out.println("乒乓球运动员学习发球和接球.");
	}
}
//具体的篮球运动员类
 class basketPlayer extends Player {
	public basketPlayer(){}
	public basketPlayer(String name,int age){
		super(name,age);
	}
	public void eat(){
		System.out.println("篮球运动员吃牛肉!");
	}
	public void study(){
		System.out.println("篮球运动员发带球和传球.");
	}
}
//具体的教练类:
//具体的乒乓球教练类
 class PingpangCoach extends Coach implements StudyEnglish{
	public PingpangCoach (){}
	public PingpangCoach(String name,int age){
		super(name,age);
	}
	public void speak(){
		System.out.println("乒乓球教练说英语!");
	}
	public void eat(){
		System.out.println("乒乓球教练吃面包!");
	}
	public void teach(){
		System.out.println("乒乓球教练教发球和接球.");
	}
}

//具体的篮球教练类
 class basketCoach extends Coach{
	public basketCoach(){}
	public basketCoach(String name,int age){
		super(name,age);
	}
	public void eat(){
		System.out.println("篮球教练吃牛排!");
	}
	public void teach(){
		System.out.println("篮球老师教带球和传球!");
	}
}
