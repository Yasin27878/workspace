public class Circle extends Shape{
	private double r;
	public Circle(){}
	public Circle(String color,double r){
		super (color);
		this.r = r;
	}
	public void setR(double r){
		this.r = r;
	}
	//��дShape��ļ����ܳ��ĳ��󷽷�
	public double calPerimeter(){
		return 2*Math.PI*r;
	}
	//��д Shape��ķ������͵ĳ��󷽷�
	public String getType(){
		return getColor()+ "Բ��";
	}
	
}