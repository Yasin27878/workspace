public class OverLoad{
	static int add (int x ,int y){
		return x+y;
	}
	static int add (int x ,int y, int z){
		return x+y+z;
	}
	static double add (double x,double y){
		return x+y;	
	}
	public static void main (String[] args){
		System.out.println(add(12,35));
		System.out.println(add(12,35,54));
		System.out.println(add(12.2,3.5));
		
	}
}