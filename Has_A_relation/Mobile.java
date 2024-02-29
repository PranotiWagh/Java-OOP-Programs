package Has_A_relation;

public class Mobile 
{
	String brand;
	String color;
	double price;
	sim s;
	Mobile(String brand, String color,double price)
	{
		this.brand=brand;
		this.color=color;
		this.price=price;
	}
	
	public void insertSim(Sim s)//helper method
	{
		this.s=s;
		System.out.println("Sim inserted");
	}
	
	public void mobileDetails()
	{
		System.out.println("==========Mobile Details=============");
		System.out.println("mobile brand"+brand);
		System.out.println("Mobile color"+color);
		System.out.println("Mobile price"+price);
	}
	public void removeSim()
	{
		this.s=null;
		System.out.println("sim removed");
	}
}
