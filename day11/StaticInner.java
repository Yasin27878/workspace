class Outer{
	int a = 123;
	private String str= "�ⲿ��ı���";
	//��̬��Ա�ڲ���
	static class Inner{
	
		String str = "�ڲ���ı���";
		void run(){
			
			System.out.println(a);
			System.out.println(str);
			
		}
		static String staticstr= "�ڲ��ྲ̬����";
		static void staticrun(){
		System.out.println("�ڲ��ྲ̬����");
	}
	
	//��Ա����
	void run (){
		System.out.println("Inner.staticstr");
		Inner.staticrun();
		//���ڲ����ʵ������,ʵ������
		Inner in= new Inner();
		System.out.println("in.str");
		in.run();
		
	}
}
public class StaticInner{
	public static void main (String[] args){
		Sysytem.out.println("Inner,staticstr");
		Outer.Inner.staticrun();
		
		//3�ڲ���
		Outer.Inner in = new Outer().new Inner();
		System.out.ptrintln(in.str);
		in.run();
		in.staticrun();
		
	}
}