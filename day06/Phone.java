import java.util.Scanner;
class Phone{
	//Ʒ��
	private String brand;
	//�۸�
	private int price;
	
	public void setBrand(String a){
		brand = a;
	}
	public String getBrand(){
		return brand;
	}
	public void setPrice(int a){
		if (a<0){
			System.out.println("�������ֻ��۸�����");
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
		
		//�̶��ֻ�Ʒ�ƺͼ۸�
		// p.setBrand("��Ϊ");
		// p.setPrice(999);
		
		//�Զ����ֻ�Ʒ�ƺͼ۸�
		System.out.print("�������ֻ�Ʒ��:\t");
		String h = sc.nextLine();
		System.out.print("�������ֻ��۸�:\t");
		int i  = sc.nextInt();
		p.setBrand(h);
		p.setPrice(i);
		
		p.Show();
		System.out.println("���"+p.getBrand()+"�ֻ����,�۸��"+p.getPrice());
	}
}