/*
	构造方法:初始化数据.
	
	构造方法的格式: A 名称和类名一致
					B 没有返回类型修饰
			格式 修饰符 类名(参数...){
			} 		
*/
class Phoneg{
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
		//创建对象
		Phone p = new Phone();
	}
}