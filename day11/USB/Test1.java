public class Test1{
	public static void main(String[] args){
		//HonorWifi h = new HonorWifi();
		USBWifi h = new HonorWifi();//����
		HonorWifi h1 = (HonorWifi)h;//����
		System.out.println("Ʒ��:"+h1.brand);
		h.open();
		h.close();
		h.read();
		h.write();
		h.usb2wifi();
	}
}