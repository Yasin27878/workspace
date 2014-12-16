package weapon;

import homework_accent.weapon;

public class Army {
	weapon[] w; 
	int index=0;
	
	public Army(int num) {
	
		super();
		this.w=new weapon[num];
	}
	public void addWeanpon(weapon wa) {
		w[index++]=wa;
		
	}
	
	public void attackAll() {
		for (int i = 0; i < w.length; i++) {
			w[i].attack();
		}
	}
	public void moveAll() {
		//for (int i = 0; i < w.length; i++) {
			//w[i].move();
		for (weapon weapon:w) {
			weapon.move();
		}
		
		}
	}
	

