package exception;

public class FinallyDemo
{
	public static void main(String args[])
	{
		try
		{
			int a=10/2;
		}
		catch(Exception e)
		{
			System.out.println("Exception handled");
		}
		finally
		{
			System.out.println("finally block");
		}
	}

}
