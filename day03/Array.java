public class Array{
	public static void main (String args[]){
		//��������:������ջ�ռ�
		int[] arr;//����ʹ������
		//int arr1[];
		//int test[10]  �������鲻����ָ����С
		//��ʼ��:�ڶѿռ�洢
		arr  = new int[10];
		int [] arr1 = {1,2,3,4,5,6,7};
		
		// �����ӳ�ʼ��
		String [] str =new String[5];
		String[] IT={"java","c","Android","c++"};
	
	/* 	����ı���
		for  each   */
		  
		System.out.println("�����ֵΪ:");
		// for(int i = 0; i < arr1.length; i++){
			// System.out.println(arr1[i]);
		// } 
		//for each:��������,����
			for(String ele : IT){
			System.out.println("IT"+ele);
			}
		//���鿽��
		String[] it_copy=IT;
		for(String ele:it_copy){
			System.out.print("IT"+ele);
		}		
	}
	
} 