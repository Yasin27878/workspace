public class Employee{
	int id;
	String name;
	double salary;
	// ���캯��:���ܱ��̳�
	// public Employee{
		// System.out.println("���캯���ܲ��ܱ�����");
	// }
	
	
	
	public String getName(){
		return name; 
	}
	public double getSalary(){
		return salary; 
	}
	public void info(){
		System.out.println("�����info����");
		System.out.println("id:"+id+"\t name:"+name + "\t salary:" + salary);
	}
}