
public class Driver 
{
	public static void main(String args[])
	{
		A a=new C();//upcasting
		B b=(B)a;//downcasting
		C c=(C)a;//downcasting
		//C d=(D)a;//downcasting
		
		System.out.println("a instanceof A");//true
		System.out.println("a instanceof B");//true
		System.out.println("a instanceof C");//true
		System.out.println("a instanceof D");//false
		
		A a1=new C();//upcasting
		B b1=(B)a;//downcasting
		C c1=(C)a;//downcasting
		//C d1=(D)a;//downcasting
		
		System.out.println("a1 instanceof A");//true
		System.out.println("a1 instanceof B");//true
		System.out.println("a1 instanceof C");//true
		System.out.println("a1 instanceof D");//true

		
	}

}
