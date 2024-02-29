package Has_A_relation;

import java.util.Scanner;
public class Mobile1Driver 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter mobile brand");
		String brand=sc.next();
		System.out.println("Enter mobile color");
		String color=sc.next();
		System.out.println("Enter mobile price");
		double price=sc.nextDouble();
		Mobile1 m=new Mobile1(brand,color,price);
		boolean exit=true;
		while(exit)
		{
			System.out.println("Enter your choice");
			System.out.println("1.Insert earphone\n 2.Remove Earphone\n3.EarphoneDetails\n4.Exit");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
			{
				System.out.println("Enter Earphone brand");
				String brand1=sc.next();
				System.out.println("Enter earphone color");
				String color1=sc.next();
				System.out.println("Enter earphone price");
				double price1=sc.nextDouble();
				m.insertEarphone(new Earphone(brand1,price1,color1));
			}
			break;
			case 2:
			{
				m.removeEarphone();
			}
			break;
			case 3:
			{
				m.earphoneDetails();
			}
			break;
			case 4:
			{
				exit=false;
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
