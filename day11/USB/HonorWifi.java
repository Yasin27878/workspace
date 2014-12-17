/*
	
*/
public class HonorWifi implements USBWifi{
	//特点
	String brand = "华为";
	//义务 USB复写
	public void read(){
		System.out.println("荣耀立方:USB read");
	}
	public void write(){
		System.out.println("荣耀立方:USB write");
	}
	//wifi
	public void open(){
		System.out.println("荣耀立方:wifi open");
	}
	public void close(){
		System.out.println("荣耀立方:wifi close");
	}
	public void usb2wifi(){
		System.out.println("荣耀立方:USB转wifi ");
	}
	
}