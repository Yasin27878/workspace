/*
	
*/
public class HonorWifi implements USBWifi{
	//�ص�
	String brand = "��Ϊ";
	//���� USB��д
	public void read(){
		System.out.println("��ҫ����:USB read");
	}
	public void write(){
		System.out.println("��ҫ����:USB write");
	}
	//wifi
	public void open(){
		System.out.println("��ҫ����:wifi open");
	}
	public void close(){
		System.out.println("��ҫ����:wifi close");
	}
	public void usb2wifi(){
		System.out.println("��ҫ����:USBתwifi ");
	}
	
}