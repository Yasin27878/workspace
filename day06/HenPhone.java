/*
	һ����׼���ֻ��స��
	��Ա���� :˽��
	���췽�� :����(ȫ������)
			  �޲�
    ��Ա����:getXxx()\setXxx()
*/

class HenPhone{
	//Ʒ��
	private String brand;
	//�۸�
	private int price;
	
	//�޲ι�����
	public HenPhone(){}
	//˫�ι�����
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
			System.out.println("�������ֻ��۸�����");
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
		
		//�̶��ֻ�Ʒ�ƺͼ۸�---��ʽһ �޲μ�setXxx()
		HenPhone p = new HenPhone();
		p.setBrand("��Ϊ");
		p.setPrice(45);
		p.Show();
		System.out.println("���"+p.getBrand()+"�ֻ����,�۸��"+p.getPrice());
		
		//�Զ����ֻ�Ʒ�ƺͼ۸�
		// System.out.print("�������ֻ�Ʒ��:\t");
		// String h = sc.nextLine();
		// System.out.print("�������ֻ��۸�:\t");
		// int i  = sc.nextInt();
		// p.setBrand(h);
		// p.setPrice(i);
		//��ʽ2 ������
		HenPhone pp = new HenPhone("iPhone",5299);
		
		System.out.println("���"+pp.getBrand()+"�ֻ����,�۸��"+pp.getPrice());
	}
}