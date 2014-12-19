package com.Collection.www;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class CollectionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection coll = new ArrayList();
		Collection co=new ArrayList();

		
		//string-----person
		coll.add("google");
		coll.add("apple");
		coll.add("oracle");
		coll.add("xiaomi");
		
		co.add("baidu");
		co.add("alibaba");
		co.add("tencent");
		coll.add("xiaomi");
		
		System.out.println("���ڵĴ�˾"+co);
		System.out.println("����Ĵ�˾"+coll);
		
		co.addAll(coll);
		System.out.println(co);
		System.out.println(coll);
		
		//2.ɾ��
		System.out.println(coll.remove("xiaomi"));
		System.out.println(coll.remove("apple"));
		System.out.println("����Ĵ�˾"+coll);
		
		//2.ɾ��,��ռ���
//		coll.removeAll(co);
//		coll.clear();
//		System.out.println("����"+coll);
		
		coll.retainAll(co);
		System.out.println("guowai"+coll);
		System.out.println("------------------");
		System.out.println("------------------");
		
		//3.�жϲ���
		System.out.println("coll.isEmpty="+coll.isEmpty());
		System.out.println("co.isEmpty="+co.isEmpty());
		System.out.println("co.contains google?"+co.contains("google"));
		System.out.println("------------------");
		//2.
		System.out.println(coll.containsAll(co));
		coll.add("yili");
		System.out.println(""+co.containsAll(coll)+co.size());
		System.out.println("------------------");
		
		Iterator it = co.iterator();
		System.out.println(""+it.next()+co.size());
		it.remove();
		System.out.println(""+co+co.size());
		System.out.println("------------------");
		
		//遍历操作
		while (it.hasNext()) {
			Object object = (Object) it.next();
			//co.add("yili");
			System.out.println(object);
		}
		System.out.println("------------------");
		for (Iterator itr = coll.iterator(); itr.hasNext();) {
			Object object = (Object) itr.next();
			System.out.println(object);
		}
		System.out.println("------------------");
		for (Object object : coll) {
			System.out.println("coll:"+object);
		}
		
	}

}
