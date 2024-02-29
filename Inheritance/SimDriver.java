import java.util.Scanner;
public class SimDriver 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Sim s=null;//generilize value
		boolean exit=true;
		while(exit)
		{
			System.out.println("enter your choice");
			System.out.println("1. Choose Sim\n 2. Sim Details \n 3.Exit");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:
				{
					System.out.println("select sim");
					System.out.println("1.Airtel\n 2.Idea");
					int choice1=sc.nextInt();
					switch(choice1)
					{
						case 1:
						{
							s=new Airtel(1234,"4G","Airetl","red");
							System.out.println("Airtel sim selected!!");
						}
						break;
						case 2:
						{
							s=new Idea(3455,"5G","Idea","yellow");
							System.out.println("Idea sim selected!!");
						}
						break;
					}
				}
				break;
				case 2:
				{
					if(s==null)
					{
						System.out.println("Sim not selected!!1 cannot display details");
					}
					else if(s instanceof Airtel)
					{
						Airtel a=(Airtel)s;//downcasting
						a.simDetails();
					}
					else if(s instanceof Idea)
					{
						Idea i=(Idea)s;//downcasting
						i.simDetails();
					}
				}
				break;
				default:
				{
					System.out.println("Invalid Input");
				}
			}
		}	
	}
}


