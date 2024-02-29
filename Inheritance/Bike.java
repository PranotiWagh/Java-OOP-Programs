package Inheritance;

public class Bike extends Vehicle
{
	Bike(String type, int no_of_wheels, double price)
	{
		super(type,no_of_wheels,price);
	}
	public void display()
	{
		System.out.println("========Bike details==========");
		System.out.println("vehicle type"+type);
		System.out.println("Vehicle No of wheels"+no_of_wheels);
		System.out.println("vehicle price"+price);
	}
}
