//��Ϥif��������ʹ��
public class IfTest{
	public static void main(String srgs[]){
	//��һ�ָ�ʽ
		if(1<100){
		System.out.println("��һ�ָ�ʽ");
		}
		//�ڶ��ָ�ʽ
		boolean flag=true;
		if(flag){
			System.out.println("����booolean����Ĭ��ֵ ��");
		}else{
			System.out.println("����booolean����Ĭ��ֵ ��");
		}
		//�����ָ�ʽ
		int score=56;
		if(score<60){
			System.out.println("������");
		}else if(score>60&&score<80){
			System.out.println("��");
		}else{
			System.out.println("����");
		}
	}
}
	
