//测试person类
public class PersonTest{
	public static void main(String[] args){
		//实例化 :引用=变量=实例;
		
		
		Person geminno =new Person();
		Person gem  =   new Person("高博");
		Person gemptc = new Person("高博集团",12);
		
		
		//对象使用 引用成员变量  引用.成员变量
		//System.out.println("Name:"+geminno.name+"Age:"+geminno.age);
		
		geminno.info();
		gem.info();
		gemptc.info();
		
		
	}//end main
}//end class