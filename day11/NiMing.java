abstract class USB{
	public abstract void read();
	public abstract void write();
}
//接口
interface Wifi{
	void open();
	void close();
}
/*
	class  USBKey extend USB{
		//特点
		//义务
		//重写
		
	}

*/

public class NiMing{
	public static void main (String[] args){
		USB udisk = new USB(){
			public void read(){
			System.out.println("读取优盘");
			}
			public void write(){
			System.out.println("写优盘");
			}
		};
		udisk.read();
		udisk.write();
		
		//Wifi
		Wifi w = new Wifi(){
			public void open(){
			System.out.println("打开Wifi");
			}
			public void close(){
			System.out.println("关闭wifi");
			}
		};
		w.open();
		w.close();
	}
}