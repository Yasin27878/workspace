/*
	ƹ�����˶�Ա�������˶�Ա��
		ƹ������������������
		Ϊ�˳�����������ƹ������ص���Ա����ҪѧϰӢ�
		������ѧ֪ʶ��
			�������������������Щ�����࣬��Щ�ӿڣ���Щ�����ࡣ

	ͨ����ͼ������
		��һ���ӿڣ�ѧӢ��Ľӿ� 
		�����������ࣺ�˶�Ա��  ������  ����
		���ĸ������ࣺƹ�����˶�Ա ƹ������� �����˶�Ա  �������
		��һ�������ࣺTest
*/
//˵Ӣ��ӿ�
 public interface StudyEnglish{
	public abstract void speak();
}
//���������
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
	//�Եĳ��󷽷�
	public abstract void eat();
}
//�˶�Ա������
 abstract class Player extends Person{
	public Player(){}
	public Player(String name,int age){
		super(name,age);
	}
	
	//ѧϰ�ĳ��󷽷�
	public abstract void study();
}
//����������
 abstract class Coach extends Person{
	public Coach(){}
	public Coach(String name,int age){
		super(name,age);
	}
	//�̵ĳ��󷽷�
	public abstract void teach();
	
}
//������˶�Ա��:

//�����ƹ�����˶�Ա��
 class PingpangPlayer extends Player implements StudyEnglish{
	public PingpangPlayer(){}
	public PingpangPlayer(String name,int age){
		super(name,age);
	}
	public void speak(){
		System.out.println("ƹ�����˶�Ա˵Ӣ��!");
	}
	public void eat(){
		System.out.println("ƹ�����˶�Ա�Լ���!");
	}
	public void study(){
		System.out.println("ƹ�����˶�Աѧϰ����ͽ���.");
	}
}
//����������˶�Ա��
 class basketPlayer extends Player {
	public basketPlayer(){}
	public basketPlayer(String name,int age){
		super(name,age);
	}
	public void eat(){
		System.out.println("�����˶�Ա��ţ��!");
	}
	public void study(){
		System.out.println("�����˶�Ա������ʹ���.");
	}
}
//����Ľ�����:
//�����ƹ���������
 class PingpangCoach extends Coach implements StudyEnglish{
	public PingpangCoach (){}
	public PingpangCoach(String name,int age){
		super(name,age);
	}
	public void speak(){
		System.out.println("ƹ�������˵Ӣ��!");
	}
	public void eat(){
		System.out.println("ƹ������������!");
	}
	public void teach(){
		System.out.println("ƹ��������̷���ͽ���.");
	}
}

//��������������
 class basketCoach extends Coach{
	public basketCoach(){}
	public basketCoach(String name,int age){
		super(name,age);
	}
	public void eat(){
		System.out.println("���������ţ��!");
	}
	public void teach(){
		System.out.println("������ʦ�̴���ʹ���!");
	}
}
