package exception;

import java.util.Scanner;

public class ThrowDemo 
{
	public static void validate(int age)
	{
		if(age>=18)
			System.out.println("elligible to vote");
		else
			throw new AgeNotFoundException();
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter you age");
		int age=s.nextInt();
		validate(age);
	}
}
