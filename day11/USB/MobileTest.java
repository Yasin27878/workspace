import java.util.Scanner;
public class MobileTest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ֻ��������λ:");
		int n = sc.nextInt();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("�������ֻ��ͺ�:");
		String m = sc1.nextLine();
		Mobile honor6 = new Mobile(n,m);
		honor6.info();
		honor6.call();
		honor6.sms();
		
		honor6.open();
		honor6.close();
		
		//System.out.println("WiFi:"+honor6.ssid+"����:"+honor6.pass);
		//�ӿ���ֱ�ӷ��ʳ���
		System.out.println("WiFi:"+Wifi.ssid+"����:"+Wifi.pass);
		
		honor6.read();
		honor6.write();
		System.out.println("USB��׼:"+honor6.version);
		System.out.println("686?");
		
	}
}