public class IdentityHashCodeTest{
	public static void main(String[] args){
		//���������s1��s2��������ͬ�Ķ���
		
		String s1 = new String ("Hello");
		String s2 = new String ("Hello");
		//String ��д��hashcoda()����---��Ϊ�����ַ����м���hashcodeֵ
		//��Ϊs1��s2���ַ�������ͬ,�������ǵ�hashcode()��������ֵ��ͬ
		System.out.println(s1.hashCode()+"----"+s2.hashCode());
		//s1��s2�ǲ�ͬ���ַ�������,�������ǵ�identityHashCodeֵ��ͬ
		System.out.println(System.identityHashCode(s1)+"----"+System.identityHashCode(s2));
		
		String s3 = "java";
		String s4 = "java";
		//s1��s2����ͬ���ַ�������,�������ǵ�identityHashCodeֵ��ͬ
		System.out.println(System.identityHashCode(s3)+"----"+System.identityHashCode(s4));
	}
}