public class Mobile implements USB,Wifi{
	private int  num;
	private String brand;
	//
	public Mobile(){}
	public Mobile(int num,String brand){
		this.num=num;
		this.brand=brand;
	}
	/* get set  info()} */
	public void setNum(int num){
		this.num=num;
		}
	public int getNum(){
		return num;
	}	
	public void setbrand(String brand){
		this.brand=brand;
		}
	public String getbrand(){
		return brand;
	}	
		
	 
	public void info(){
		System.out.println("Ʒ��:"+brand+"\n����:"+num);
	}
	public void call(){
		System.out.println("��绰");
	}
	public void sms(){
		System.out.println("����Ϣ");
	}
	
	//ʵ��������: ʵ�ֽӿ�[����]�ĳ��󷽷�
	public void open(){
		System.out.println("Open Wifi");
	}
	public void close(){
		System.out.println("Close WiFi");
	}
	public void read(){
		System.out.println("Read USB");
	}
	public void write(){
		System.out.println("Write USB");
	}
}