public class AbsTest{
	public static void main(String[] args){
		Shape s1= new Triangle("��ɫ",3,4,5);
		Shape s2 = new Circle("��ɫ",4);
		System.out.println(s1.getType());
		System.out.println("�ܳ���"+s1.calPerimeter());
		System.out.println(s2.getType());
		System.out.println("�ܳ���"+s2.calPerimeter());
		System.out.println("--------------------------");
				 
		Triangle s11 = new Triangle();
		Circle s22 = new Circle();
		s11.setColor("��");
		s11.setSides(3,4,5);
		
		s22.setColor("��");
		s22.setR(10);
		System.out.println(s11.getType());
		System.out.println("�ܳ���"+s11.calPerimeter());
		System.out.println(s22.getType());
		System.out.println("�ܳ���"+s22.calPerimeter());
		
		System.out.println("--------------------------");
		Triangle s12 = new Triangle();
		Shape s23 = new Circle();
		Triangle b =(Triangle)s12;
		Circle c  = (Circle)s23;
		
		b.setColor("��ɫ");
		b.setSides(4,5,6);
		c.setR(6.0);
		c.setColor("��ɫ");
		System.out.println(b.getType());
		System.out.println("�ܳ���"+b.calPerimeter());
		System.out.println(c.getType());
		System.out.println("�ܳ���"+c.calPerimeter());
	}
}