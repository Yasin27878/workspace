public class Triangle extends Shape{
	private double a;
	private double b;
	private double c;
	public Triangle(){}
	public Triangle(String color,double a,double b,double c){
		super (color);
		this.setSides(a,b,c);
	}
	public void setSides(double a,double b,double c){
		if(a>=b+c||b>=c+a||c>=a+b){
			System.out.println("����������֮�ͱ�����ڵ�����");
			return;
		}
		this.a = a;
		this.b = b;
		this.c = c;
		System.out.println("a b c��ֵΪ:"+a+" "+b+" "+c);
		
	}
	//��дShape��ļ����ܳ��ĳ��󷽷�
	public double calPerimeter(){
		return a + b +c;
	}
	//��д Shape��ķ������͵ĳ��󷽷�
	public String getType(){
		return getColor()+ "������";
	}
	
}