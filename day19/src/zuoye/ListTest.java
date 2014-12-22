package zuoye;
import java.util.ArrayList;
import java.util.Iterator;

public class ListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<Student> c =new ArrayList<Student>();
		
		c.add(new Student("吴林染",99));
		c.add(new Student("黄家新",98));
		c.add(new Student("吴良全",99));
		c.add(new Student("胡辉",100));
		c.add(new Student("张凯翔",97));

		
		for (Iterator iterator = c.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
		
	}

}
