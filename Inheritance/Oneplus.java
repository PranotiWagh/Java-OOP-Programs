package Inheritance;

public class Oneplus extends Mobile
{	
	Oneplus(String brand,String model,String color)
	{
		super(brand,model,color);
	}
		public void MobileDetails()
		{
			System.out.println("---------Oneplus Details-------");
			System.out.println("Mobile brand is="+brand);
			System.out.println("Mobile model is"+model);
			System.out.println("Mobile color is"+color);
		}
}



