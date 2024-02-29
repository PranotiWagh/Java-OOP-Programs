import java.util.Scanner;
public class EmployeeDriver 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Employee e=null;//generilize value
		boolean exit=true;
		while(exit)
		{
			System.out.println("enter your choice");
			System.out.println("1. Choose Employee\n 2. Employee Details \n 3.Exit");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:
				{
					System.out.println("select Employee Type");
					System.out.println("1.Parmenent\n 2.Contract");
					int choice1=sc.nextInt();
						switch(choice1)
						{
							case 1:
							{
									e=new ParmenentEmployee(1234,"Pranoti",20,"Google");
									System.out.println("Parmenent Employee selected!!");
								}
								break;
								case 2:
								{
									e=new ContractEmployee(3455,"Gopika",21,"Microsoft");
									System.out.println("Contract Employee selected!!");
								}
								break;
							}
						}
						break;
						case 2:
						{
							if(e==null)
							{
								System.out.println("Employee type not selected!!1 cannot display details");
							}
							else if(e instanceof ParmenentEmployee)
							{
								ParmenentEmployee p=(ParmenentEmployee)e;//downcasting
								p.EmployeeDetails();
							}
							else if(e instanceof ContractEmployee)
							{
								ContractEmployee c=(ContractEmployee)e;//downcasting
								c.EmployeeDetails();
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
