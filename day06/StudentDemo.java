/*
	��Ա����ȫ��˽�в��� �ṩ��Ӧ�� setXxx() /getXxx()
	���ʱ�� ����û�м��� �߼�У��
	A ������ͻ��˵ĵط� �Ѿ�У����
	B ��ʹ��������java�����У��   Ҳ����У����
	
	����Ҫ֪�� ���ǿ�����setXxx()�����м���У�� ֻ��������û�м�
	
	setXxx();����Ա������ֵ
	getXxx();������ȡ��Ա������ֵ
	//
*/
class Student{
	private String name;
	private int age;
	
	public void setName(String a){
		name = a ;
	}
	public String getName(){
		return name;
	}
	public void setAge(int a){
		if(a<0||a>150){
			System.out.println("���������������");
		}else{
		//��age��ֵ
		age = a ;
		}
	}
	public int getAge(){
		return age;
	}
	public void show(){
		System.out.println(name + "----" + age);
	}
}

class StudentDemo{
	public static void main(String[] args){
		Student s= new Student();
		// System.out.println(s.getName());
		// System.out.println(s.getAge());
		// s.show();
		//����Ա������ֵ
		 s.setName("��־��");
		 s.setAge(-27);
		//ͨ��show������ʾ���е�ֵ
		s.show();
		//ͨ��get������ʾ����
		System.out.println(s.getName()+"------"+s.getAge());
		
		
	}
}