class Outer{
	int a = 123;
	private String str= "�ⲿ��ı���";
	//��Ա�ڲ���
	class Inner{
		final static int a = 321;
		String str = "�ڲ���ı���";
		void run(){
			String str = "�ֲ�����";
			System.out.println("�ڲ���run()");
			System.out.println(a);
			System.out.println(str);
			System.out.println(this.str);
			System.out.println(Outer.this.str);
		}
	}
	
	//��Ա����
	void run (){
		System.out.println("�ⲿ��run()");
		Inner in= new Inner();
		in.run();
	}
}
public class InnerDemo{
	public static void main (String[] args){
		//�ⲿ��ʹ��
		Outer outer=new Outer();
		outer.run();
		
		//3�ڲ���
		Outer.Inner inner = new Outer().new Inner();
		inner.run();
		
	}
}