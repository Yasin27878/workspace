import java.util.Scanner;
public class ScannerLongTest{
	public static void main(String[] args){
	//System.in �����׼���� ���Ǽ�������
		Scanner sc = new Scanner(System.in);
	//�ж��Ƿ���һ��long����
		while(sc.hasNextLong()){
		//���������
			System.out.println("���������������:"+ sc.nextLong());
		}
	}
}