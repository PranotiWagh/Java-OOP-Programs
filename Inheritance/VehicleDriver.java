package Inheritance;
import java.util.Scanner;
public class VehicleDriver {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("----------car details-----------");
		System.out.println("Enter vehicle type");
		String type=sc.next();
		System.out.println("enter vehicle no of wheels");
		int no_of_wheels=sc.nextInt();
		System.out.println("enter vehicle price");
		double price=sc.nextDouble();
		System.out.println("enter no of doors");
		int no_of_doors=sc.nextInt();
		Car c=new Car(type,no_of_wheels,price,no_of_doors);
		c.display();
		System.out.println("-----------bike details------------");
		System.out.println("Enter bike type");
		String type1=sc.next();
		System.out.println("enter vehicle no of wheels");
		int no_of_wheels1=sc.nextInt();
		System.out.println("enter vehicle price");
		double price1=sc.nextDouble();
		
		Bike b=new Bike(type1,no_of_wheels1,price1);
		b.display();
		

	}

}
