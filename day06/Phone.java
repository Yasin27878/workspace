import java.util.Scanner;
class Phone{
	//品牌
	private String brand;
	//价格
	private int price;
	
	public void setBrand(String a){
		brand = a;
	}
	public String getBrand(){
		return brand;
	}
	public void setPrice(int a){
		if (a<0){
			System.out.println("你输入手机价格有误");
		}else {
			price = a;
		}
	}
	public int getPrice(){
		return price;
	}
	public void Show(){
		System.out.println(brand+"---------"+price);
	}
}

class PhoneDemo{
	public static void main(String[] args){
		Phone p = new Phone();
		Scanner sc = new Scanner(System.in);
		
		//固定手机品牌和价格
		// p.setBrand("华为");
		// p.setPrice(999);
		
		//自定义手机品牌和价格
		System.out.print("请输入手机品牌:\t");
		String h = sc.nextLine();
		System.out.print("请输入手机价格:\t");
		int i  = sc.nextInt();
		p.setBrand(h);
		p.setPrice(i);
		
		p.Show();
		System.out.println("这款"+p.getBrand()+"手机真好,价格才"+p.getPrice());
	}
}