/**
 * 
 */
package homework_employee;

/**
 * @author yili270
 *
 */
public class SalariedEmployee extends Employee {
	private double monthSalary;//固定月薪
	/**
	 * 
	 */
	public SalariedEmployee() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param salary
	 * @param brithMonth
	 */
	public SalariedEmployee(String name, double monthSalary, int brithMonth) {
		super(name,brithMonth);
		this.monthSalary=monthSalary;
		
	}

	public double getMonthSalary() {
		return monthSalary;
	}

	
}
