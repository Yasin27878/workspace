public class Manager extends Employee{
	String car;
	String office;
	//���еķ�ʽ
	public void drive(){
		//System.out.println("name:" + name +"��"+car +"�ϰ�");
		System.out.println("name:" + super.name +"��"+car +"�ϰ�");
	}
 	//super:��������� 
	public void info(){
		System.out.println("�����info����");
		//System.out.println("id:"+id+"\t name:"+name + "\t salary:" + salary);
		super.info();
		System.out.println("car:" + car + "\noffice"+office);
	
	}
}