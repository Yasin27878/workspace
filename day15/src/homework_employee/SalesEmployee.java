package homework_employee;

public class SalesEmployee extends Employee {
	private double sales;
	private float percent;
    
 public SalesEmployee() {
	super();
}
 public SalesEmployee(String name,int brithMonth,double sales,float percent){
	super(name,brithMonth);
	this.sales = sales;
	this.percent=percent;
}
	@Override
	public double getSalary(int month) {
		// TODO Auto-generated method stub
		return super.getSalary(month)+sales*percent;
	}

	
}
