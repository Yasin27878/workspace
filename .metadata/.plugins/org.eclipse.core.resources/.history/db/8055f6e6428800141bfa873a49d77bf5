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
            根据类Student的定义，创建五个该类的对象，选择合适的集合存储，输出每个学生的信息，  
            计算并输出这五个学生Java语言成绩的平均值，以及计算并输出他们Java语言成绩的最大值和最小值。
            
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

	public int getsNo() {
		return sNo;
	}

	public void setsNo(int sNo) {
		this.sNo = sNo;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public char getsSex() {
		return sSex;
	}

	public void setsSex(char sSex) {
		this.sSex = sSex;
	}

	public int getsAge() {
		return sAge;
	}

	public void setsAge(int sAge) {
		this.sAge = sAge;
	}

	public int getsJava() {
		return sJava;
	}

	public void setsJava(int sJava) {
		this.sJava = sJava;
	}

	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + sAge;
		result = prime * result + sJava;
		result = prime * result + ((sName == null) ? 0 : sName.hashCode());
		result = prime * result + sNo;
		result = prime * result + sSex;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (sAge != other.sAge)
			return false;
		if (sJava != other.sJava)
			return false;
		if (sName == null) {
			if (other.sName != null)
				return false;
		} else if (!sName.equals(other.sName))
			return false;
		if (sNo != other.sNo)
			return false;
		if (sSex != other.sSex)
			return false;
		return true;
	}

	public int compareTo(Object o) {
		
		return 0;
	}
	
	public String toString() {
		return "Student [sNo=" + sNo + ", sName=" + sName + ", sSex=" + sSex
				+ ", sAge=" + sAge + ", sJava=" + sJava + "]";
	}
	
	
	

}
