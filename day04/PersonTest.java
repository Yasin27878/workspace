//����person��
public class PersonTest{
	public static void main(String[] args){
		//ʵ���� :����=����=ʵ��;
		
		
		Person geminno =new Person();
		Person gem  =   new Person("�߲�");
		Person gemptc = new Person("�߲�����",12);
		
		
		//����ʹ�� ���ó�Ա����  ����.��Ա����
		//System.out.println("Name:"+geminno.name+"Age:"+geminno.age);
		
		geminno.info();
		gem.info();
		gemptc.info();
		
		
	}//end main
}//end class