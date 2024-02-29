package exception;

public class ExceptionObjectPropogationDemo2 
{
	public static void greet(String str)
	{
		System.out.println(str);
		welcome(null);
	}
	public static void welcome(String str)
	{
		try
		{
			if(str.equals("welcome"));
			System.out.println(str);
		}
		catch(Exception e)
		{
			System.out.println("exception handled");
		}
		public static void main(String args[])
		{
			System.out.println("main starts");
			greet("good evening");
			System.out.println("main ends");	
		}
	}
	

}
