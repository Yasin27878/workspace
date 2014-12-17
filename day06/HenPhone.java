/*
	一个标准的手机类案例
	成员变量 :私有
	构造方法 :带参(全部参数)
			  无参
    成员方法:getXxx()\setXxx()
*/

class HenPhone{
	//品牌
	private String brand;
	//价格
	private int price;
	
	//无参构造器
	public HenPhone(){}
	//双参构造器
	public HenPhone(String brand,int price){
		this.brand=brand;
		this.price=price;
	}
	
	public void setBrand(String brand){
		this.brand = brand;
	}
	public String getBrand(){
		return brand;
	}
	public void setPrice(int price){
		if (price<0){
			System.out.println("你输入手机价格有误");
		}else {
			this.price = price;
		}
	}
	public int getPrice(){
		return price;
	}
	public void Show(){
		System.out.println(brand+"---------"+price);
	}
}

class PhoneDemo1{
	public static void main(String[] args){
		//Scanner sc = new Scanner(System.in);	
		
		//固定手机品牌和价格---方式一 无参加setXxx()
		HenPhone p = new HenPhone();
		p.setBrand("华为");
		p.setPrice(45);
		p.Show();
		System.out.println("这款"+p.getBrand()+"手机真好,价格才"+p.getPrice());
		
		//自定义手机品牌和价格
		// System.out.print("请输入手机品牌:\t");
		// String h = sc.nextLine();
		// System.out.print("请输入手机价格:\t");
		// int i  = sc.nextInt();
		// p.setBrand(h);
		// p.setPrice(i);
		//方式2 带参数
		HenPhone pp = new HenPhone("iPhone",5299);
		
		System.out.println("这款"+pp.getBrand()+"手机真好,价格才"+pp.getPrice());
	}
}