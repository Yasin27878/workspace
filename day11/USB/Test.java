public class Test{
	public  static void main (String[] args){
		
		
		USBKey u = new USBKey();
		System.out.println("���̵�Ʒ����:"+u.brand);//ͨ���������
		u.read();
		u.write();
		//�̳е�����ת�� VS �ӿ�,ʵ���������ת��
		USB up = new USBKey();
		System.out.println("���̵�Ʒ����:"+USBKey.brand);//ͨ����������
		up.read();
		up.write();
		System.out.println("---------------------------");
		Udisks d = new Udisks();
		System.out.println("���̵�Ʒ����:"+d.brand);
		System.out.println("���̵�Ʒ����:"+Udisks.brand);
		d.read();
		d.write();
	
	}
}