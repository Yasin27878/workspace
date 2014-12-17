/*
	抽象类(不完整的类)只能被继承,子类实现其所有抽象方法(完成的类)
	
*/
public abstract class Shape{
	//抽象类的组成:
	private String color;
	{
		System.out.println("执行Shape的初始化块....");
	}
	//求周长的抽象方法
	public abstract double calPerimeter();
	//定义返回形状的抽象方法
	public abstract String getType();
	
	//构造方法的作用是供子类去调用
	public Shape(){}
	public Shape(String color){
		System.out.println("shape构造器");
		this.color = color;
	}
	//省略color属性的set和get方法
	public void setColor(String color){
		this.color = color;
	}
	public String getColor(){
		return this.color;
	}
	
}

