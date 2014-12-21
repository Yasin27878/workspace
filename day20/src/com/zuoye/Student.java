/*
 * 定义一个表示学生信息的类Student，要求如下：
　（1）类Student的成员变量：
            sNO示学号；sName表示姓名；sSex表示性别；sAge表示年龄；          sJava：表示Java课程成绩。
　（2）类Student带参数的构造方法： 
            在构造方法中通过形参完成对成员变量的赋值操作。
  （3）类Student的方法成员：
            getNo（）：获得学号； 
            getName（）：获得姓名； 
            getSex（）：获得性别；
            getAge（）获得年龄；
            getJava（）：获得Java 课程成绩
            根据类Student的定义，创建五个该类的对象，选择合适的集合存储，输出每个学生的信息，  计算并输出这五个学生Java语言成绩的平均值，以及计算并输出他们Java语言成绩的最大值和最小值。
            
 * */
package com.zuoye;

public class Student implements Comparable{

	int sNo;
	String sName;
	char sSex;
	int sAge;
	int sJava;

	public Student() {
		super();
	}

	public Student(int sNo, String sName, char sSex, int sAge, int sJava) {
		super();
		this.sNo = sNo;
		this.sName = sName;
		this.sSex = sSex;
		this.sAge = sAge;
		this.sJava = sJava;
	}

	public int getNo() {
		return sNo;
	}

	public void setNo(int sNo) {
		this.sNo = sNo;
	}

	public String getName() {
		return sName;
	}

	public void setName(String sName) {
		this.sName = sName;
	}

	public char getSex() {
		return sSex;
	}

	public void setSex(char sSex) {
		this.sSex = sSex;
	}

	public int getAge() {
		return sAge;
	}

	public void setAge(int sAge) {
		this.sAge = sAge;
	}

	public int getJava() {
		return sJava;
	}

	public void setJava(int sJava) {
		this.sJava = sJava;
	}


	public int compareTo(Object o) {
		Student t= (Student)o;
		
		int res= this.getJava()-t.getJava();

		return res==0?this.getNo()-t.getNo():res; 
	}
	
	public String toString() {
		return "Student [sNo=" + sNo + ", sName=" + sName + ", sSex=" + sSex
				+ ", sAge=" + sAge + ", sJava=" + sJava + "]";
	}
	
	
	

}
