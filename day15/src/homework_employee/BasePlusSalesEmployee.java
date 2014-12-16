package homework_employee;

public class BasePlusSalesEmployee extends SalesEmployee {

	private double baseSalary;
	
	public BasePlusSalesEmployee(){}
	public BasePlusSalesEmployee(String name,int brithMonth,double sales,float percent,double baseSalary) {
		
		super(name,brithMonth,sales,percent);
		this.baseSalary = baseSalary;
	}
	public double getBaseSalary(int month) {
		return super.getSalary(month)+this.baseSalary;
	}
	
	
	
}
