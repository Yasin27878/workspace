package homework_employee;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		//固定月薪的员工
		SalariedEmployee se = new SalariedEmployee("google",22222.22,1);
		System.out.println("name:"+se.getName()+"\t Salary"+se.getSalary(1));
		System.out.println("name:"+se.getName()+"\t Salary"+se.getSalary(12));
		
		//小时工
		//HourlyEmployee he = new HourlyEmployee("Baidu",2,10,159);
		HourlyEmployee he = new HourlyEmployee("Baidu",2,333,169);
		System.out.println("name:"+he.getName()+"\tSalary:"+he.getSalary(2));
		System.out.println("name:"+he.getName()+"\tSalary:"+he.getSalary(12));
		
		//无底薪销售
		SalesEmployee se1 = new SalesEmployee("alibaba",3,999999,0.2f);
		System.out.println("name:"+se1.getName()+"\tSalary:"+se1.getSalary(3));
		System.out.println("name:"+se1.getName()+"\tSalary:"+se1.getSalary(12));
		
		//有底薪销售
		BasePlusSalesEmployee be = new BasePlusSalesEmployee("oracle",4,100000.0,0.2f,8888);
		System.out.println("name:"+se.getName()+"\tSalary:"+se.getSalary(4));
		System.out.println("name:"+se.getName()+"\tSalary:"+se.getSalary(5));

	}

}
