/*
	4,定义3个类：Tank,Flighter,WarShip都继承自Weapon,分别用不同的方式实现 Weapon 类中的抽象方法。
*/
//实现坦克的方法
public class Tank extends Weapon{
	public void move(){
		System.out.println("坦克前进!");
	}
	 public void attack(){
		System.out.println("坦克攻击!");
	}
}
//实现战斗机的方法
class Flighter extends Weapon{
	public  void move(){
		System.out.println("战斗机前进!");
	}
	public void  attack(){
		System.out.println("战斗机攻击!");
	}
}
//实现军舰的方法
class WarShip extends Weapon{
	public void  move(){
		System.out.println("军舰前进!");
	}
	public void attack(){
		System.out.println("军舰攻击!");
	}
}