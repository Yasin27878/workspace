import java.util.Scanner;
class Demo{
	public int getSum(int a,int b){
	return a*b;
	} 
}
class Test {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("������a��ֵ");
		int a = sc.nextInt();
		
		System.out.print("������b��ֵ");
		int b = sc.nextInt();
		
		Demo d = new Demo();
		int result=d.getSum(a,b);
		System.out.print("����Ľ����"+result);
	
	}
}