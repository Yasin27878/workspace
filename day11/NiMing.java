abstract class USB{
	public abstract void read();
	public abstract void write();
}
//�ӿ�
interface Wifi{
	void open();
	void close();
}
/*
	class  USBKey extend USB{
		//�ص�
		//����
		//��д
		
	}

*/

public class NiMing{
	public static void main (String[] args){
		USB udisk = new USB(){
			public void read(){
			System.out.println("��ȡ����");
			}
			public void write(){
			System.out.println("д����");
			}
		};
		udisk.read();
		udisk.write();
		
		//Wifi
		Wifi w = new Wifi(){
			public void open(){
			System.out.println("��Wifi");
			}
			public void close(){
			System.out.println("�ر�wifi");
			}
		};
		w.open();
		w.close();
	}
}