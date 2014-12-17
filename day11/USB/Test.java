public class Test{
	public  static void main (String[] args){
		
		
		USBKey u = new USBKey();
		System.out.println("键盘的品牌是:"+u.brand);//通过对象访问
		u.read();
		u.write();
		//继承的向上转型 VS 接口,实现类的向上转型
		USB up = new USBKey();
		System.out.println("键盘的品牌是:"+USBKey.brand);//通过类名访问
		up.read();
		up.write();
		System.out.println("---------------------------");
		Udisks d = new Udisks();
		System.out.println("优盘的品牌是:"+d.brand);
		System.out.println("优盘的品牌是:"+Udisks.brand);
		d.read();
		d.write();
	
	}
}