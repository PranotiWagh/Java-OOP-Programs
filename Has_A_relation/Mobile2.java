package Has_A_relation;

public class Mobile2 
{
	String brand;
	int ram;
	int price;
	Sim2 s;
	Mobile2(String brand,int ram,int price)
	{
		this.brand=brand;
		this.ram=ram;
		this.price=price;
	}
	public void  insertSim(Sim2 s)
	{
		this.s=s;
		System.out.println("sim inserted");
	}
	
	
	public void removeSim()
	{
		this.s=null;
	}
	public void getSim()
	{
		System.out.println("==========Mobile details==========");
		System.out.println("mobile brand"+brand);
		System.out.println("mobile ram is"+ram);
		System.out.println("mobile price is"+price);
		
	}

}
