/*
	������(����������)ֻ�ܱ��̳�,����ʵ�������г��󷽷�(��ɵ���)
	
*/
public abstract class Shape{
	//����������:
	private String color;
	{
		System.out.println("ִ��Shape�ĳ�ʼ����....");
	}
	//���ܳ��ĳ��󷽷�
	public abstract double calPerimeter();
	//���巵����״�ĳ��󷽷�
	public abstract String getType();
	
	//���췽���������ǹ�����ȥ����
	public Shape(){}
	public Shape(String color){
		System.out.println("shape������");
		this.color = color;
	}
	//ʡ��color���Ե�set��get����
	public void setColor(String color){
		this.color = color;
	}
	public String getColor(){
		return this.color;
	}
	
}

