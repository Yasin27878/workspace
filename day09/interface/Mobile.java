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
		System.out.println("品牌:"+brand+"\n号码:"+num);
	}
	public void call(){
		System.out.println("打电话");
	}
	public void sms(){
		System.out.println("发信息");
	}
	
	//实现类义务: 实现接口[所有]的抽象方法
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