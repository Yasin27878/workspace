/*
	6��дһ��������ȥ�������ϳ���
*/
public class ArmyTest{
	public static void main(String[] args){
		Army a =new Army(3);
		Weapon t = new Tank();
		a.addWeapon(t);
		Weapon f= new Flighter();
		a.addWeapon(f);
		Weapon s=new WarShip();
		a.addWeapon(s);

		
		a.attackAll();
		a.moveAll();
	}
}