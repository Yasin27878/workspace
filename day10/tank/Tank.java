/*
	4,����3���ࣺTank,Flighter,WarShip���̳���Weapon,�ֱ��ò�ͬ�ķ�ʽʵ�� Weapon ���еĳ��󷽷���
*/
//ʵ��̹�˵ķ���
public class Tank extends Weapon{
	public void move(){
		System.out.println("̹��ǰ��!");
	}
	 public void attack(){
		System.out.println("̹�˹���!");
	}
}
//ʵ��ս�����ķ���
class Flighter extends Weapon{
	public  void move(){
		System.out.println("ս����ǰ��!");
	}
	public void  attack(){
		System.out.println("ս��������!");
	}
}
//ʵ�־����ķ���
class WarShip extends Weapon{
	public void  move(){
		System.out.println("����ǰ��!");
	}
	public void attack(){
		System.out.println("��������!");
	}
}