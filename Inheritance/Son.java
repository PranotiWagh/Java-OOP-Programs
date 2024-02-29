package Inheritance;

public class Son extends Father
{
	String name="Smith";
	public void sonData()
	{
		System.out.println("son's name"+name );
		System.out.println("Fathers name"+super.name);
	}

}
