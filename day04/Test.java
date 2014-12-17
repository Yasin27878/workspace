import java.util.Scanner;
class Demo{
	public int getSum(int a,int b){
	return a*b;
	} 
}
class Test {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入a的值");
		int a = sc.nextInt();
		
		System.out.print("请输入b的值");
		int b = sc.nextInt();
		
		Demo d = new Demo();
		int result=d.getSum(a,b);
		System.out.print("输出的结果是"+result);
	
	}
}