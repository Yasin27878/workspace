/*
	���췽��:��ʼ������.
	
	���췽���ĸ�ʽ: A ���ƺ�����һ��
					B û�з�����������
			��ʽ ���η� ����(����...){
			} 		
*/
class Phoneg{
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
		//��������
		Phone p = new Phone();
	}
}