import java.util.Scanner;
public class MobileTest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入手机号码后四位:");
		int n = sc.nextInt();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("请输入手机型号:");
		String m = sc1.nextLine();
		Mobile honor6 = new Mobile(n,m);
		honor6.info();
		honor6.call();
		honor6.sms();
		
		honor6.open();
		honor6.close();
		
		//System.out.println("WiFi:"+honor6.ssid+"密码:"+honor6.pass);
		//接口名直接访问常量
		System.out.println("WiFi:"+Wifi.ssid+"密码:"+Wifi.pass);
		
		honor6.read();
		honor6.write();
		System.out.println("USB标准:"+honor6.version);
		System.out.println("686?");
		
	}
}