/*
	3,����һ��������Weapon,ʵ��Assaultable�ӿں�Mobile�ӿڣ�����û�и��������ʵ�ַ�����
*/
//����������
public abstract class Weapon implements Assaultable,Mobile{
		// public abstract void see(){
			// System.out.println("����������");
		// }
		public abstract void move();
		public abstract void attack();
}