public class Test1{
	public static void main(String[] args){
		//HonorWifi h = new HonorWifi();
		USBWifi h = new HonorWifi();//向上
		HonorWifi h1 = (HonorWifi)h;//向下
		System.out.println("品牌:"+h1.brand);
		h.open();
		h.close();
		h.read();
		h.write();
		h.usb2wifi();
	}
}