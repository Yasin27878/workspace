public class Array{
	public static void main (String args[]){
		//声明数组:变量在栈空间
		int[] arr;//建议使用这种
		//int arr1[];
		//int test[10]  声明数组不可以指定大小
		//初始化:在堆空间存储
		arr  = new int[10];
		int [] arr1 = {1,2,3,4,5,6,7};
		
		// 声明加初始化
		String [] str =new String[5];
		String[] IT={"java","c","Android","c++"};
	
	/* 	数组的遍历
		for  each   */
		  
		System.out.println("数组的值为:");
		// for(int i = 0; i < arr1.length; i++){
			// System.out.println(arr1[i]);
		// } 
		//for each:遍历数组,集合
			for(String ele : IT){
			System.out.println("IT"+ele);
			}
		//数组拷贝
		String[] it_copy=IT;
		for(String ele:it_copy){
			System.out.print("IT"+ele);
		}		
	}
	
} 