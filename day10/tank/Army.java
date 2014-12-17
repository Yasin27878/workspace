/* 5,写一个类Army,代表一支军队，这个类有一个属性是Weapon数组w（用来存储该军队所拥有
的所有武器）；该类还提供一个构造方法，在构造方法里通过传一个int类型的参数来限定该类
所能拥有的最大武器数量,并用这一大小来初始化数组w。该类还提供一个方法addWeapon(Weapon 
wa),表示把参数wa所代表的武器加入到数组w中。在这个类中还定义两个方法attackAll()和
moveAll()，让w数组中的所有武器攻击和移动。
*/
//类Army
public class Army{
	Weapon [] m;
	int n=0;
	int num;
	
	//army的构造方法
	public Army(){}
	public Army(int num){
	 this.num=num;
	m = new Weapon[num];
	}
	//将一个参数加入到数组中
	public void addWeapon(Weapon wa){
		if(n<num){
			m[n]=wa;
			System.out.println("武器库加入了"+(n+1)+"个武器");
			n++;
		}
		
	}
	//让所有武器攻击 就是将数组遍历一次
	public void attackAll(){
		for(int i=0;i<m.length;i++){
			m[i].attack();
		}
	}
	public void moveAll(){
		for(int i=0;i<m.length;i++){
			m[i].move();
		}
	}
	
}