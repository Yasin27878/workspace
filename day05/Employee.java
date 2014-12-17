public class Employee{
	int id;
	String name;
	double salary;
	// 构造函数:不能被继承
	// public Employee{
		// System.out.println("构造函数能不能被调用");
	// }
	
	
	
	public String getName(){
		return name; 
	}
	public double getSalary(){
		return salary; 
	}
	public void info(){
		System.out.println("父类的info方法");
		System.out.println("id:"+id+"\t name:"+name + "\t salary:" + salary);
	}
}