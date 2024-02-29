package Has_A_relation;

import java.util.Scanner;
public class Company
{
	String  company_name;
	Employee e;
	Company(String  company_name)
	{
		this.company_name=company_name;
	}
	public void addEmployee(Employee e)//helper method
	{
		if(this.e!=null)
		{
			System.out.println("Employee already exist");
		}
		else
		{
			this.e=e;
			System.out.println("Employee added successfully");
		}
	}
	public void removeEmployee()
	{
		if(e!=null)
		{
			e=null;
			System.out.println("Employee removed !!");
		}
		else
		{
			System.out.println("EMployee not found");
		}
	}
	public void updateEmployee()
	{
		if(e!=null)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter new name that you want to update!!");
			String new_name=sc.next();
			e.setName(new_name);
			System.out.println("Name updated Successfully");
			System.out.println("The updated name is"+e.getName());
		}
		else
		{
			System.out.println("Employee name not found");
		}
	}
	public void getEmpDetails()
	{
		if(e!=null)
		{
			System.out.println("=======Employee details=======");
			System.out.println("name of employee is "+e.getName());
			System.out.println("d of employee is"+e.getEmpId());
			System.out.println("Cno of employee is"+e.getCno());
		}
		else
		{
			System.out.println("Employee not found!!!!");
		}
	}
	

}
