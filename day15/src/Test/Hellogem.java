package Test;

import java.util.Scanner;

public class Hellogem {


	public static void main(String[] args) {
		System.out.println("请输入课程代号(1-3之间的数):");
		Scanner in = new Scanner(System.in);
		int courseCode = in.nextInt();
		switch (courseCode) {
		case 1:
			System.out.println("C#编程");
			break;
		case 2:
			System.err.println("java编程");
			break;
		case 3:
			System.out.println("sql基础");
			break;
		default:
			System.out.println("输入有误!");
			break;
		}
	}

}
