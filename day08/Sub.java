public class Sub extends Base{
	String str="sub class";
	void sub_show(){
		System.out.println("sub���е�����");
	}
	void show(){
		System.out.println("sub class");
	}
	
	public static void main(String[] args){
		//����ת��:Ĭ�ϻ������� ָ�� �������
		Base base = new Sub();
		//System.out.println(base.str);
		//base.str;
		
		System.out.println(base.a);
		base.base_show();
		base.show();
		
		//����ת��
		Base ba = new Sub();
		Sub sub = (Sub)ba;
		//���ʸ��������
		System.out.println(sub.a);
		sub.base_show();
		//���ิд����ķ���
		sub.show();
		
		//�������������
	}
}