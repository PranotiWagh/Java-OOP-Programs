package Inheritance;

public class Samsung extends Mobile
{
		
	Samsung(String brand,String model,String color)
	{
		super(brand,model,color);
	}
	public void MobileDetails()
	{
		System.out.println("---------Samsung Details-------");
		System.out.println("Mobile brand is="+brand);
		System.out.println("Mobile model is"+model);
		System.out.println("Mobile color is"+color);
	}
}



