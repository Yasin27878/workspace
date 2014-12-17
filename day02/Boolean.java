import java.util.*; 
public class Boolean{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("print your score:");
		int score = in.nextInt();
		int x=-100;
		String type=score<60?"不及格":"及格";
		int flag = x>0?1:(x==0?0:-1);
		System.out.println("type="+type);
		System.out.println("flag="+flag);
		}
}
/*
	Scanner in = new Scanner (System.in);
	System.out.print("what is your name:");
	String name =in.nextLine();
	Scanner in =new Scanner (System.in);
	int score=in.nextInt();
*/