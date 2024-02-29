package Inheritance;

public class ParentDriver 
{
	public static void main(String args[])
	{
		Parent p=new Parent();
		p.display();
		Child c=new Child();
		c.display();
		c.display1();
		
		Parent p1=new Child();//Upcasting
		p1.display();
		//p1.display1();//CTE one upcasted cannot access child class member
	}

}
