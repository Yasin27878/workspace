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
	//重写Shape类的计算周长的抽象方法
	public double calPerimeter(){
		return 2*Math.PI*r;
	}
	//重写 Shape类的返回类型的抽象方法
	public String getType(){
		return getColor()+ "圆形";
	}
	
}