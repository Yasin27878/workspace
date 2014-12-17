public class IntTest{
	public static void main(String args[]){
			// 小整型常量默认自动转化int类型
			int num=88;
			// 大整数常量不会自动转化long类型
			long long1 = 888888888888L;//建议是大写L
			long long2 = 888888888888l;//
			// 八进制表示整型,0开头
			int Var=013;
			System.out.println("Var:"+Var);
			// 十六进制表示整数,以0x 0X开头;
			int hexNum=0xFF;
			int hexNum1=0X1F;
			System.out.println("hexNum:"+hexNum+"\nhexNum1"+hexNum1);
			// 二进制表示:以0b.0B开头
			byte byteNum =(byte)0b11111111;
			int intNum =0b11111111;
			System.out.println("byteNum:"+byteNum+"\nintNum:"+intNum);
			
			
	}
}