class Outer {
	int a = 123;
	private String str = "yili";
	
	void run (){
		String local_var = "�ֲ�����";
		final int num = 1111;
		//�ֲ��ڲ���
		//public class Inner{}   error
		//static class Inner{}   error
		class Inner{
			int aaa=888;
			static final String a= "nihao";
			static final String s= "nihao2";
			
			void inner_run(){
				System.out.println("�ڲ���:��Ա����"+num);  //local_var���ܷ��ʾֲ�����
				System.out.println(a+"\t"+str);
				System.out.println(Outer.this.str);
			}
		}
	}
}



public class LocalInner{
	public static void main (String[] args){
	}
}