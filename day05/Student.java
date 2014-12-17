public class Student{
	String name;
	public Student(String name){
		this.name = name;
	}
	 Student get(){
		return this;
	 }
	public static void main(String[] args){
		Student s1 = new Student("yili");
		Student s2 = new Student("yili270");
		System.out.println( s1);
		System.out.println( s1.get().name);
		System.out.println( s2);
		System.out.println( s2.get().name);
	}
}