package Inheritance;

public class ParentDriver1 
{
	public static void main(String args[])
	{
		Parent1 p=new Child1();//upcasting
		p.showmessage();
		System.out.println(p.name);
		//System.out.println(p.age);
		//p.showmessage(); //once upcasted cannot access child member
		Child1 c1=(Child1)p;//downcasting
		c1.showmessage();
		c1.showmessage1();
		System.out.println(c1.name);
		System.out.println(c1.age);
	}

}
