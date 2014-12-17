/**
	this的作用 A 用于区分成员变量和局部变量
				在方法内使用变量的时候采用就近原则
			   B 可以在 		
				
*/
class Person{
	private String name;
	private int age;
	
	public (){}
	public Person(String name){
		this.name = mane;
	}
	public Person(String name int age){
		//this.name=name;
		this(name);
		this.age=age;
	}
	
	public void setName(String name ){
		this.name = name ;
	}

}