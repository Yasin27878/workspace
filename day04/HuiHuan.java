//���1-9999999֮������еĻػ���;
/* import java.util.Scanner;
public class HuiHuan{
	public static void main(String args[]){
	
		
		int num1=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ����:");
		int num = sc.nextInt();
		int n=num;
		int [] arr=new int[8]; 
		int index=0;
		while(num>0){
		arr[index]=num%10;
		num/=10;
		index++;
		}
		
		for(int i=0;i<index;i++){
		num1=(num1+arr[i])*10;
		}
		if(n==num1){
			System.out.println(num+"��һ���ػ���");
		}else {
			System.out.println(num+"����һ���ػ���");
		}
		
	}
} */
//a1+10*a2

import java.util.Scanner;

/**
 * �ж�һ������λ�� �����ж��ǲ���Ϊ������
 * 
 */
public class HuiHuan {
	public static void main(String[] args) {
		long a = 0;
		System.out.println("����һ����");
		// �Ӽ��̻�ȡһ����
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		long i = sc.nextInt();
		// ��Ϊ֮���i��ı� �����ȸ�ֵ��l
		long l = i;
		// ���������Ǽ�λ��
		System.out.println("�������  " + (i + "") + " ��  " + (i + "").length()
				+ "λ��");
		// ͨ��for ѭ�� ���������λ���� �õ�a
		for (int j = 0; j < (l + "").length(); j++) {
			a = a * 10 + i % 10;
			i = i / 10;
		}
		// �ж���β�������Ƿ����ԭֵ
		if (a == l) {
			System.out.println("�������" + l + "�ǻ�����");
		} else {
			System.out.println("�������" + l + "���ǻ�����");
		}
	}
}