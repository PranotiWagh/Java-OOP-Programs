
public class Airtel extends Sim
{
	String color;
	Airtel(long sim_no,String network_type,String service_provider,String color)
	{
		super(sim_no,network_type,service_provider);
		this.color=color;
	}
	public void simDetails()
	{
		System.out.println("---------Airtel Details-------");
		System.out.println("sim no="+sim_no);
		System.out.println("Network Type"+network_type);
		System.out.println("color"+color);
	}

}


}
