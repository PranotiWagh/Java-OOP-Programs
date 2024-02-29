package Inheritance;

import java.util.Scanner; 

public class MobileDriver 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Mobile e=null;//generilize value
		boolean exit=true;
		while(exit)
		{
			System.out.println("enter your choice");
			System.out.println("1. Choose mobile\n 2. Mobile Details \n 3.Exit");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				{
					System.out.println("select Mobile Type");
					System.out.println("1.Nokia\n 2.Samsung\n 3.Oneplus");
					int choice1=sc.nextInt();
					switch(choice1)
						{
							case 1:
							{
									e=new Nokia("Nokia","abc","black");
									System.out.println("Nokia Mobile Selected selected!!");
							}
							break;
							case 2:
								{
									e=new Samsung("Samsung","pqr","green");
									System.out.println("Samsung Mobile selected!!");
								}
							break;
							case 3:
							{
								e=new Oneplus("Oneplus","xyz","red");
								System.out.println("Oneplus Mobile selected!!");
							}
							}
					}
					break;
					case 2:
					{
						if(e==null)
						{
							System.out.println("Mobile type not selected!!1 cannot display details");
						}
						else if(e instanceof Nokia)
						{
							Nokia p=(Nokia)e;//downcasting
							p.MobileDetails();
						}
						else if(e instanceof Samsung)
						{
							Samsung c=(Samsung)e;//downcasting
							c.MobileDetails();
						}
						else if(e instanceof Oneplus)
						{
							Oneplus o=(Oneplus)e;//downcasting
							o.MobileDetails();
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



