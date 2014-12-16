import homework_accent.weapon;
import weapon.Army;
import weapon.Flighter;
import weapon.Tank;
import weapon.WarShip;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Army p=new Army(3);
		weapon t=new Tank();
		p.addWeanpon(t);
		weapon f=new Flighter();
		p.addWeanpon(f);
		weapon s =new WarShip();
		p.addWeanpon(s);
		//p.addWeanpon(new Tank());
		
		
		p.attackAll();
		p.moveAll();
		
	}
	
}
