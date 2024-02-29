import java.util.Scanner;
public class CabDriver 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("===================");
		System.out.println("Press 1 for Mini");
		System.out.println("Press 2 for Micro");
		System.out.println("Press 3 for Sedan");
		int choice=sc.nextInt();
		Cab c=null;
		switch(choice)
		{
			case 1:
			{
				c=new Mini();//upcasting
				System.out.println("Mini selected !!");
				Mini m=(Mini)c;//downcasting
				m.display();
			}
			break;
			case 2:
			{
				c=new Micro();//upcasting
				System.out.println("Micro selected !!");
				Micro m1=(Micro)c;//downcasting
				m1.display();
			}
			break;
			case 3:
			{
				c=new Sedan();//upcasting
				System.out.println("Sedan selected !!");
				Sedan s=(Sedan)c;//downcasting
				s.display();
			}
			break;
			default:
			{
				System.out.println("Invalid inputs");
			}
		}
	}

}
