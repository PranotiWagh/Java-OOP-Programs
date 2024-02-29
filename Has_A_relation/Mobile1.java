package Has_A_relation;

public class Mobile1 
{
	String brand;
	String color;
	double price;
	Earphone e;
	Mobile1(String brand,String color,double price)
	{
		this.brand=brand;
		this.color=color;
		this.color=color;
	}
	public void insertEarphone(Earphone e)//helper method
	{
		if(this.e==null)
		{
		this.e=e;
		System.out.println("Earphone inserted successfully!!");
		}
		else
		{
			System.out.println("Earphone alread inserted!!");
		}
	}
	public void removeEarphone()
	{
		if(e==null)
		{
			System.out.println("Earphone not found!!!");
		}
		else
		{
			e=null;
			System.out.println("Earphone removed");
		}
	}	
	public void earphoneDetails()
	{
		if(e==null)
		{
			System.out.println("Earphone not inserted!!!");
		}
		else
		{
			System.out.println("=======Earphone details=======");
			System.out.println("Earphone brand is"+e.brand);
			System.out.println("Earphone color is"+e.color);
			System.out.println("Earphone price"+e.price);	
	   }
    }
}


