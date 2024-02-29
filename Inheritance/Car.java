package Inheritance;

public class Car extends Vehicle
{
	int no_of_doors;
	Car(String type, int no_of_wheels,double price, int no_of_doors)
	{
		super(type,no_of_wheels,price);
		this.no_of_doors=no_of_doors;
	}
	public void display()
	{
		System.out.println("=======car details=======");
		System.out.println("vehicle type"+type);
		System.out.println("Vehicle no of wheels"+no_of_wheels);
		System.out.println("Vehicle price"+price);
		System.out.println("Car no of doors"+no_of_doors);
	}
}	
