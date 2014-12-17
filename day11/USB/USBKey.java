public class USBKey implements USB{
	//特点
	static final String brand = "Cherry";
	//芯片:
	//义务
	public void read(){
		System.out.println("读键盘");
	}
	public void write(){
		System.out.println("写键盘");
	}
	
}