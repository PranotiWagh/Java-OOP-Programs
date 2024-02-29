package collection;

import java.util.ArrayList;

public class ArrayListForLoopDemo 
{
	public static void main(String args[])
	{
		ArrayList list=new ArrayList();
		list.add("karthik");
		list.add('a');
		list.add(45);
		list.add(3.4f);
		list.add(true);
		list.add("seema");
		System.out.println(list);
	    System.out.println("======iterating elements=====");
	    for(int i=0;i<list.size();i++)
	    	System.out.println(list.get(i));)
	}
}
