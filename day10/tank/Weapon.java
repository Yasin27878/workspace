/*
	3,定义一个抽象类Weapon,实现Assaultable接口和Mobile接口，但并没有给出具体的实现方法。
*/
//武器抽象类
public abstract class Weapon implements Assaultable,Mobile{
		// public abstract void see(){
			// System.out.println("武器很厉害");
		// }
		public abstract void move();
		public abstract void attack();
}