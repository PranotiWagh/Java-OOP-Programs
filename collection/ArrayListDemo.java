package collection;

import java.util.ArrayList;

public class ArrayListDemo
{
	public static void mian(String args[])
	{
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(false);
		al.add(5.4);
		al.add('A');
		al.add("apple");
		al.add("apple");
		System.out.println("ArrayList1"+al);
		System.out.println(al.size());//6
		System.out.println(al.get(0));//10
		System.out.println(al.get(1));//false
		System.out.println(al.remove(5));//apple
		System.out.println(al);
		ArrayList al1=new ArrayList();
		al1.add("mango");
		al1.add("banana");
		System.out.println("ArrayList2"+al1);
		al1.add(al);
		System.out.println(al1.get(2));
		System.out.println("updated arrayList"+al1);
	}
}
