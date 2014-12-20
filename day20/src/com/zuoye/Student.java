/*
 * ����һ����ʾѧ����Ϣ����Student��Ҫ�����£�
����1����Student�ĳ�Ա������
            sNOʾѧ�ţ�sName��ʾ������sSex��ʾ�Ա�sAge��ʾ���䣻          sJava����ʾJava�γ̳ɼ���
����2����Student�������Ĺ��췽���� 
            �ڹ��췽����ͨ���β���ɶԳ�Ա�����ĸ�ֵ������
  ��3����Student�ķ�����Ա��
            getNo���������ѧ�ţ� 
            getName��������������� 
            getSex����������Ա�
            getAge����������䣻
            getJava���������Java �γ̳ɼ�
            ������Student�Ķ��壬�����������Ķ���ѡ����ʵļ��ϴ洢�����ÿ��ѧ������Ϣ��  
            ���㲢��������ѧ��Java���Գɼ���ƽ��ֵ���Լ����㲢�������Java���Գɼ������ֵ����Сֵ��
            
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
