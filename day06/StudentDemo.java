/*
	成员变量全部私有并且 提供对应的 setXxx() /getXxx()
	这个时候 我们没有加入 逻辑校验
	A 在浏览客户端的地方 已经校验了
	B 即使真正的在java程序端校验   也配置校验框架
	
	我们要知道 我们可以在setXxx()方法中加入校验 只不过我们没有加
	
	setXxx();给成员变量赋值
	getXxx();单独获取成员变量的值
	//
*/
class Student{
	private String name;
	private int age;
	
	public void setName(String a){
		name = a ;
	}
	public String getName(){
		return name;
	}
	public void setAge(int a){
		if(a<0||a>150){
			System.out.println("你给出的年龄有误");
		}else{
		//给age赋值
		age = a ;
		}
	}
	public int getAge(){
		return age;
	}
	public void show(){
		System.out.println(name + "----" + age);
	}
}

class StudentDemo{
	public static void main(String[] args){
		Student s= new Student();
		// System.out.println(s.getName());
		// System.out.println(s.getAge());
		// s.show();
		//给成员变量赋值
		 s.setName("林志玲");
		 s.setAge(-27);
		//通过show方法显示所有的值
		s.show();
		//通过get方法显示所有
		System.out.println(s.getName()+"------"+s.getAge());
		
		
	}
}