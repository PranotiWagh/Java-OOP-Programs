package Has_A_relation;

public class Sim
{
	String sim_name;
	int sim_no;
	String sim_color;
	Sim(String sim_name,int sim_no,String sim_color)
	{
		this.sim_name=sim_name;
		this.sim_no=sim_no;
		this.sim_color=sim_color;
	}
	
	public void simDetails()
	{
		System.out.println("======Sim details=========");
		System.out.println("sim name is"+sim_name);
		System.out.println("sim color is"+sim_color);
		System.out.println("sim no"+sim_no);
	}

}
