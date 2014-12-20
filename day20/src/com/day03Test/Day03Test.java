/*
 * 1.定义一个20*5的二维数组，用来存储某班级20位学员的5门课的成绩；这5门课
  按存储顺序依次为：core C++，coreJava，Servlet，JSP和EJB。
  （1）循环给二维数组的每一个元素赋0~100之间的随机整数。
  （2）按照列表的方式输出这些学员的每门课程的成绩。
  （3）要求编写程序求每个学员的总分，将其保留在另外一个一维数组中。
  （4）要求编写程序求所有学员的某门课程的平均分。
 * */
package com.day03Test;


public class Day03Test {
	
	
	public static void main(String[] args) {
		
		int [][] score=new int[20][5];
		int [] allscore=new int[20];
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 5; j++) {
				//1.循环给二维数组的每一个元素赋0~100之间的随机整数。
				score[i][j]=(int)(Math.random()*100);
				System.out.print(score[i][j]+"  ");
			}
			//按照列表的方式输出这些学员的每门课程的成绩。
			System.out.println();
		}
		//每个学员的总分，将其保留在另外一个一维数组中
		for (int i = 0; i < 20; i++) {
			
			allscore[i]=score[i][0]+score[i][1]+score[i][2]+score[i][3]+score[i][4];
			System.out.println(allscore[i]);
		}
		
		//（4）要求编写程序求所有学员的某门课程的平均分
			double Average1=0;
	
		
				
				Average1=(score[0][1]+score[1][1]+score[2][1]+score[3][1]+score[4][1])/5;
				System.out.println("coreJavad的平均分为:"+Average1);
		
		
		//int a= (int)(Math.random()*100);
	}

}
