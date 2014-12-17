public class Manager extends Employee{
	String car;
	String office;
	//特有的方式
	public void drive(){
		//System.out.println("name:" + name +"开"+car +"上班");
		System.out.println("name:" + super.name +"开"+car +"上班");
	}
 	//super:父类的引用 
	public void info(){
		System.out.println("子类的info方法");
		//System.out.println("id:"+id+"\t name:"+name + "\t salary:" + salary);
		super.info();
		System.out.println("car:" + car + "\noffice"+office);
	
	}
}