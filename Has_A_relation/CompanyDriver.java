package Has_A_relation;

import java.util.Scanner;
public class CompanyDriver 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter company name");
		String company_name=sc.next();
		Company c=new Company(company_name);
		boolean exit=true;
		while(exit) 
		{
			System.out.println("Enter your choice");
			System.out.println("1.Add Employee \n 2.Remove Employee\n 3.Update Employee\n 4.Employee Deatils\n 5.Exit");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:
				{
					System.out.println("Enter Employee name");
					String emp_name=sc.next();
					System.out.println("Enter employee id");
					int emp_id=sc.nextInt();
					System.out.println("Enter employee cno");
					long cno=sc.nextLong();
					c.addEmployee(new Employee(emp_name,emp_id,cno));
				}
				break;
				case 2:
				{
					c.removeEmployee();
				}
				break;
				case 3:
				{
					c.removeEmployee();
				}
				break;
				case 4:
				{
					c.getEmpDetails();
				}
				break;
				case 5:
				{
					exit=false;
				}
				break;
				default:
				{
					System.out.println("Invalid choice!!");
				}
			}
			
			
		}
		
		
		
	}

}
