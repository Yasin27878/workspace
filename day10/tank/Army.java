/* 5,дһ����Army,����һ֧���ӣ��������һ��������Weapon����w�������洢�þ�����ӵ��
�����������������໹�ṩһ�����췽�����ڹ��췽����ͨ����һ��int���͵Ĳ������޶�����
����ӵ�е������������,������һ��С����ʼ������w�����໹�ṩһ������addWeapon(Weapon 
wa),��ʾ�Ѳ���wa��������������뵽����w�С���������л�������������attackAll()��
moveAll()����w�����е����������������ƶ���
*/
//��Army
public class Army{
	Weapon [] m;
	int n=0;
	int num;
	
	//army�Ĺ��췽��
	public Army(){}
	public Army(int num){
	 this.num=num;
	m = new Weapon[num];
	}
	//��һ���������뵽������
	public void addWeapon(Weapon wa){
		if(n<num){
			m[n]=wa;
			System.out.println("�����������"+(n+1)+"������");
			n++;
		}
		
	}
	//�������������� ���ǽ��������һ��
	public void attackAll(){
		for(int i=0;i<m.length;i++){
			m[i].attack();
		}
	}
	public void moveAll(){
		for(int i=0;i<m.length;i++){
			m[i].move();
		}
	}
	
}