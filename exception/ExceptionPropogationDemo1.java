package exception;

public class ExceptionPropogationDemo1 
{
	public static void m1()//caller method
	{
		int a=10;
		int b=0;
		int c=a/b;
		System.out.println(c);
	}
	public static void main(String args[])
	{
		try
		{
			m1();
		}
		catch(Exception e)
		{
			System.out.println("exception handled");
		}
	}
}
