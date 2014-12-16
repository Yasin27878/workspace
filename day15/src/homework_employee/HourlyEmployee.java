package homework_employee;

public class HourlyEmployee extends Employee {
	private double hourPay;
	private int hours;
	
	public HourlyEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HourlyEmployee(String name, int brithMonth,double hourPay,int hours) {
		super(name, brithMonth);
		// TODO Auto-generated constructor stub
		this.hourPay= hourPay;
		this.hours=hours;
	}

	@Override
	public double getSalary(int month) {
		double res = super.getSalary(month);
		if(this.hours<160){
			res +=hourPay*hours;
		}else {
			res+= hourPay*160+(hours-160)*hourPay*1.5;
		}
		return res;
	}
	

}
