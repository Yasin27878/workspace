public class PlayerTest{
	public static void  main (String[] args){
		//����
		System.out.println("---------------------˫�ι���-----------------------");
		PingpangCoach c1 = new PingpangCoach("����Ƽ",36);
		System.out.println(c1.getName()+"-----"+c1.getAge());
		c1.eat();
		c1.speak();
		c1.teach();
		
		PingpangPlayer p1 = new PingpangPlayer("��־��",27);
		System.out.println(p1.getName()+"-----"+p1.getAge());
		p1.eat();
		p1.speak();
		p1.study();
		System.out.println("----------------------------");
		
		basketCoach c2 = new basketCoach("Ҧ��",32);
		System.out.println(c2.getName()+"-----"+c2.getAge());
		c2.eat();
		c2.teach();
	
		basketPlayer p2 = new basketPlayer("С��",20);
		System.out.println(p2.getName()+"-----"+p2.getAge());
		p2.eat();
		p2.study();
		System.out.println("---------------------�޲ι���-------------------------");
		PingpangCoach c11 = new PingpangCoach();
		c11.setName("������");
		c11.setAge(23);
		System.out.println(c11.getName()+"-----"+c11.getAge());
		c11.eat();
		c11.speak();
		c11.teach();
		
		PingpangPlayer p11 = new PingpangPlayer();
		p11.setName("����ȫ");
		p11.setAge(22);
		System.out.println(p11.getName()+"-----"+p11.getAge());
		p11.eat();
		p11.speak();
		p11.study();
		System.out.println("----------------------------");
		
		basketCoach c22 = new basketCoach();
		c22.setName("����Ȼ");
		c22.setAge(22);
		System.out.println(c22.getName()+"-----"+c22.getAge());
		c22.eat();
		c22.teach();
	
		basketPlayer p22 = new basketPlayer();
		p22.setName("���");
		p22.setAge(21);
		System.out.println(p22.getName()+"-----"+p22.getAge());
		p22.eat();
		p22.study();
	}
}