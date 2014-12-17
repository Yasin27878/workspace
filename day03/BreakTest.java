public class BreakTest{
	public static void main(String srga[]){
		int stop=4;
		for (int i=0;i<10;i++){
			if(i==stop){
			System.out.println("满足条件,退出整个循环");
			break;
			}
			System.out.println("i=" + i);
		}
	}
}