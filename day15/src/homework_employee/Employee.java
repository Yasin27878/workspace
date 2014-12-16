package homework_employee;

public class Employee {
	private String name;
	private double salary;
	private int brithMonth;
	public Employee(){}
	public Employee(String name, int brithMonth) {
		super();
		this.name = name;
		this.brithMonth = brithMonth;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary(int month) {
	
		if (this.brithMonth==month) {
			System.out.println("祝"+this.name+"生日快乐!");
			return this.salary +=100;
		}else{
		
			return this.salary;
		}
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getBrithMonth() {
		return brithMonth;
	}
	public void setBrithMonth(int brithMonth) {
		this.brithMonth = brithMonth;
	}
	
	

}
