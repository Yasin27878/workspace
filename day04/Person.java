//��ô�Զ�����
public class Person{//public����ļ�ͬ��
	//��Ա����
	String name;
	int age;
	
	//������������ĳ�Ա����,�����ǳ�ʼ����Ա����,Ҳ��������
	// ����ͬ�� û�з���ֵ
	//1.�޲ι��캯�� 
	Person(){
		System.out.println("this is nice man!�����Զ����޲ι�����");
	}
	//һ�ι�����
	Person (String name){
		System.out.println("this is nice man!����һ�ι�����");
		this.name=name+"001";
		}
		//���ι�����
	Person (String name, int age){
		System.out.println("this is nice man!���Ƕ��ι�����");
		this.name=name+"002";
		this.age=age+1;
	}
		
	
	
	//��Ա����
	void setName(String name){
		this.name=name;
		System.out.println("nihao");
	}
	String getName(){
		return this.name;
	}
	
	void info(){
		System.out.println("Name:"+this.name+"\t Age:"+
		this.age);
	}
	
	
}