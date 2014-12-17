//找出100到200之间的质数
public class Prime{
	public static void main(String args[]){
		int i,m;
		for (i=100;i<201;i++){
			boolean b=true;
			for(m=2;m<i;m++){
				if(i%m==0){
				b=false;
				break;
				}	
			}
			if(b){
				System.out.println(i+"是一个质数!");
				}
		}
	}
}
