//抽象的狗
//dog 某种品种的狗
public class Dog{
	//属性
	//品种
	int age;
	String color;
	static String type;//品种 类变量 不依赖于对象[对象引用.]
	
	//方法
	
	Dog(){
	
	}
	Dog(int age,String color){
		this.age = age;
		this.color = color;
	}
	voidbarking(){}
	System.out.println("barking.....");
	
}